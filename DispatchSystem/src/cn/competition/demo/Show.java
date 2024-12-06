package cn.competition.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Show {
    public static List<Integer> waferProductivity(List<Procedure> procedureList) throws IOException {
        int procedureNum = (procedureList.size() + 1) / 75;
        List<Integer> productivityList = new ArrayList<>();
        for (int i = 0; i < 75; i++) {
            int productivity = 0;
            int endTime = procedureList.get(procedureNum * i + procedureNum - 1).getEtime();
            int startTime = endTime - 36000;
            if (startTime <= 0) {
                productivity = i + 1;
            } else {
                for (int j = 0; j < i; j++) {
                    int s = procedureList.get(procedureNum * j).getStime();
                    if (s >= startTime) {
                        productivity = i - j + 1;
                        break;
                    }
                }
            }
            productivityList.add(productivity);
        }
        return productivityList;
    }

    public static List<Machine> procedureListToMachineList(List<Procedure> procedureList) {
        List<Machine> machineList = new ArrayList<>();
        for (Procedure procedure : procedureList) {
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Machine machine : machineList) {
                if (procedure.getProcedure().equals(machine.getMachine())) {
                    Working working1 = new Working(procedureList.indexOf(procedure) / 17, procedure.getStime(), procedure.getEtime());
                    machine.getWorkingList().add(working1);
                    counter++;
                }
            }
            if (counter == 0) {
                Working working = new Working(procedureList.indexOf(procedure) / 17, procedure.getStime(), procedure.getEtime());
                workingList.add(working);
                Machine machine1 = new Machine(procedure.getProcedure(), workingList);
                machineList.add(machine1);
            }
        }
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
        machineList = resort(machineList);
//        for (Machine machine : machineList) {
//            System.out.println(machine.toString());
//        }
        return machineList;
    }

    public static List<Procedure> read(String path, int waferNum) throws IOException {
        List<Procedure> procedureList = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(path);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int lastRowNum = 18;//sheet.getLastRowNum();
        //int waferNum = 3;
        for (int j = 0; j < waferNum; j++) {
            for (int i = 1; i <= lastRowNum; i++) {
                XSSFRow row = sheet.getRow(i);
                if (row != null) {
                    List<String> list = new ArrayList<>();
                    for (Cell cell : row) {
                        if (cell != null) {
                            cell.setCellType(CellType.STRING);
                            String value = cell.getStringCellValue();
                            if (value != null && !"".equals(value)) {
                                list.add(value);
                            }
                        }
                    }
                    if (list.size() > 0) {
                        Procedure procedure = new Procedure(String.valueOf(list.get(0 + 5 * j)), Integer.parseInt(list.get(1 + 5 * j)), Integer.parseInt(list.get(2 + 5 * j)), Integer.parseInt(list.get(3 + 5 * j)), Integer.parseInt(list.get(4 + 5 * j)));
                        procedureList.add(procedure);
                    }
                }
            }
        }
        return procedureList;
    }

    public static void write(List<Procedure> procedureList, String path, int wafer) throws IOException {
        wafer--;
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFRow xssfRow = wafer == 0 ? xssfSheet.createRow(0) : xssfSheet.getRow(0);
        xssfRow.createCell(0 + 5 * wafer).setCellValue("Procedures");
        xssfRow.createCell(1 + 5 * wafer).setCellValue("MID");
        xssfRow.createCell(2 + 5 * wafer).setCellValue("Ctime");
        xssfRow.createCell(3 + 5 * wafer).setCellValue("Stime");
        xssfRow.createCell(4 + 5 * wafer).setCellValue("Etime");
        for (int j = 0; j < 17; j++) {
            XSSFRow xssfRow1 = wafer == 0 ? xssfSheet.createRow(j + 1) : xssfSheet.getRow(j + 1);
            xssfRow1.createCell(0 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + j).getProcedure());
            xssfRow1.createCell(1 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + j).getMid());
            xssfRow1.createCell(2 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + j).getCtime() / 10.0);
            xssfRow1.createCell(3 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + j).getStime() / 10.0);
            xssfRow1.createCell(4 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + j).getEtime() / 10.0);
        }
        XSSFRow xssfRow1 = wafer == 0 ? xssfSheet.createRow(18) : xssfSheet.getRow(18);
        xssfRow1.createCell(0 + 5 * wafer).setCellValue("晶圆" + (wafer + 1));
        xssfRow1.createCell(3 + 5 * wafer).setCellValue("总时间");
        xssfRow1.createCell(4 + 5 * wafer).setCellValue(procedureList.get(17 * wafer + 16).getEtime() / 10.0 - procedureList.get(17 * wafer).getStime() / 10.0);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        xssfWorkbook.close();
    }

    public static void writeMachineList(List<Machine> machineList, String path) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        for (int i = 0; i < machineList.size(); i++) {
            XSSFRow xssfRow = xssfSheet.createRow(i);
            xssfRow.createCell(0).setCellValue(machineList.get(i).getMachine());
            for (Working working : machineList.get(i).getWorkingList()) {
                xssfRow.createCell(2 * machineList.get(i).getWorkingList().indexOf(working) + 1).setCellValue(working.getStartTime());
                xssfRow.createCell(2 * machineList.get(i).getWorkingList().indexOf(working) + 2).setCellValue(working.getEndTime());
            }
        }
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        xssfWorkbook.close();
    }

    public static void writeStayTime(int machineNumber, List<Machine> machineList, String path) throws IOException {
        int wafer = 75;
//        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFRow xssfRow = xssfSheet.createRow(0);
        xssfRow.createCell(0).setCellValue("晶圆号");
        for (int i = 0; i < machineNumber; i++) {
            xssfRow.createCell(i + 1).setCellValue("PM" + (i + 1));
        }
        for (int j = 0; j < wafer; j++) {
            XSSFRow xssfRow1 = xssfSheet.createRow(j + 1);
            xssfRow1.createCell(0).setCellValue("晶圆" + (j + 1));
            for (int i = 0; i < machineNumber; i++) {
                for (Machine machine : machineList) {
                    if (machine.getMachine().equals("PM" + (i + 1))) {
                        int counter = 0;
                        for (Working working : machine.getWorkingList()) {
                            if (working.getWid() == j) {
                                xssfRow1.createCell(i + 1).setCellValue((working.getEndTime() - working.getStartTime()) / 10.0);
                                counter++;
                            }
                        }
                        if (counter == 0)
                            xssfRow1.createCell(i + 1).setCellValue("未加工");
                    }
                }
            }
        }
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        xssfWorkbook.close();
    }

    public static List<Machine> resort(List<Machine> machineList) {
        List<Machine> machineList1 = new ArrayList<>();
        for (Machine machine : machineList) {
            int[] temp = new int[machine.getWorkingList().size()];
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Working working : machine.getWorkingList()) {
                if (working.getStartTime() != working.getEndTime()) {
                    temp[counter] = working.getStartTime();
                    counter++;
                }
            }
            Arrays.sort(temp);
            for (int i = 0; i < temp.length; i++) {
                for (Working working : machine.getWorkingList()) {
                    if (working.getStartTime() == temp[i])
                        workingList.add(working);
                }
            }
            machineList1.add(new Machine(machine.getMachine(), workingList));
        }
        return machineList1;
    }

    public static int lookLastTime(int num, String s, List<Machine> machineList) {
        int d = 9999;
        lookLastTime:
        for (Machine machine : machineList) {
            if (s.contains("PM")) {
                if (s.equals(machine.getMachine()) && machine.getWorkingList().size() != 0) {
                    d = machine.getWorkingList().get(num).getEndTime();
                    break lookLastTime;
                } else {
                    d = 0;
                }
            } else {
                if (s.contains(machine.getMachine()) && machine.getWorkingList().size() != 0) {
                    d = machine.getWorkingList().get(num).getEndTime();
                    break lookLastTime;
                } else {
                    d = 0;
                }
            }
        }
        return d;
    }

    public static int lookFirstTime(int num, String s, List<Machine> machineList) {
        int d = 9999;
        lookFirstTime:
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                d = machine.getWorkingList().get(num + 1).getStartTime();
                break lookFirstTime;
            }
        }
        return d;
    }

    public static String lookWaferHouse(int time, List<Machine> machineList) {
        int index = 99;
        String waferHouse = null;
        List<Working> workingList = new ArrayList<>();
        for (Machine machine : machineList) {
            if (machine.getMachine().equals("TM1")) {
                lookWaferHouse:
                for (Working working : machine.getWorkingList()) {
                    if (working.getStartTime() == time || working.getEndTime() == time) {
                        index = working.getWid();
                        break lookWaferHouse;
                    }
                }
            }
        }
        for (Machine machine : machineList) {
            if (machine.getMachine().equals("TM1")) {
                for (Working working : machine.getWorkingList()) {
                    if (working.getWid() == index) {
                        workingList.add(working);
                    }
                }
            }
        }
        if (workingList.size() != 0) {
            if (time == workingList.get(0).getStartTime() || time == workingList.get(workingList.size() - 1).getEndTime())
                waferHouse = "LP" + (index / 25 + 1);
        }
        return waferHouse;
    }

    public static String lookLastPosition_TM1(int startTime, List<Machine> machineList, int specialTime, String specialPosition) {
        String s = null;
        int counter = 0;
        lookLastPosition_TM1:
        for (Machine machine : machineList) {
            if (machine.getWorkingList().size() == 0) {
                continue lookLastPosition_TM1;
            } else if (machine.getMachine().contains("AL") || machine.getMachine().contains("LLA") || machine.getMachine().contains("LLB")) {
                for (Working working : machine.getWorkingList()) {
                    if (startTime == working.getStartTime()) {
                        s = machine.getMachine();
                        counter++;
                        break lookLastPosition_TM1;
                    }
                }
            }
        }
        if (counter == 0) {
            if (startTime == specialTime) {
                s = specialPosition;
            } else {
                s = lookWaferHouse(startTime, machineList);
            }
        }
        return s;
    }

    public static String lookLastPosition_TM2(int startTime, List<Machine> machineList, int specialTime, String specialPosition) {
        String s = null;
        lookLastPosition_TM2:
        for (Machine machine : machineList) {
            if (machine.getWorkingList().size() == 0)
                continue lookLastPosition_TM2;
            else if (machine.getMachine().contains("PM") || machine.getMachine().contains("LL")) {
                for (Working working : machine.getWorkingList()) {
                    if (startTime == working.getStartTime()) {
                        s = machine.getMachine();
                        break lookLastPosition_TM2;
                    }
                }
            }
        }
        if (startTime == specialTime)
            s = specialPosition;
        return s;
    }

    public static String lookNextPosition_TM1(int endTime, List<Machine> machineList) {
        String s = null;
        int counter = 0;
        lookLastPosition_TM1:
        for (Machine machine : machineList) {
            if (machine.getWorkingList().size() == 0) {
                continue lookLastPosition_TM1;
            } else if (machine.getMachine().contains("AL") || machine.getMachine().contains("LLA") || machine.getMachine().contains("LLB")) {
                for (Working working : machine.getWorkingList()) {
                    if (endTime == working.getEndTime()) {
                        s = machine.getMachine();
                        counter++;
                        break lookLastPosition_TM1;
                    }
                }
            }
        }
        if (counter == 0)
            s = lookWaferHouse(endTime, machineList);
        return s;
    }

    public static String lookNextPosition_TM2(int endTime, List<Machine> machineList) {
        String s = null;
        lookLastPosition_TM2:
        for (Machine machine : machineList) {
            if (machine.getWorkingList().size() == 0)
                continue lookLastPosition_TM2;
            else if (machine.getMachine().contains("PM") || machine.getMachine().contains("LL")) {
                for (Working working : machine.getWorkingList()) {
                    if (endTime == working.getEndTime()) {
                        s = machine.getMachine();
                        break lookLastPosition_TM2;
                    }
                }
            }
        }
        return s;
    }

    public static int lookWorkingListSize(String s, List<Machine> machineList) {
        int d = 9999;
        lookWorkingListSize:
        for (Machine machine : machineList) {
            if (s.contains("PM")) {
                if (s.equals(machine.getMachine())) {
                    d = machine.getWorkingList().size();
                    break lookWorkingListSize;
                }
            } else {
                if (s.contains(machine.getMachine())) {
                    d = machine.getWorkingList().size();
                    break lookWorkingListSize;
                }
            }
        }
        return d;
    }

    public static int lookDistance(String startDest, String dest, List<Distance> distanceList) {
        int dis = 9999;
        lookDistance:
        for (Distance distance : distanceList) {
            if (startDest.contains(distance.getStartDest()) && dest.contains(distance.getDest())) {
                dis = distance.getDistance();
                break lookDistance;
            }
        }
        return dis;
    }

    public static int findDistance(String startDest, String dest) {
        int startNum = 0;
        int destNum = 0;
        if (startDest.contains("PM")) {
            for (int i = 1; i <= 6; i++) {
                if (startDest.contains("" + i))
                    startNum = i;
            }
        } else {
            if (startDest.contains("A"))
                startNum = 8;
            else
                startNum = 7;
        }
        if (dest.contains("PM")) {
            for (int i = 1; i <= 6; i++) {
                if (dest.contains("" + i))
                    destNum = i;
            }
        } else {
            if (dest.contains("A"))
                destNum = 8;
            else
                destNum = 7;
        }
        if (startNum >= destNum) {
            if ((startNum - destNum) <= 4)
                return 4 * (startNum - destNum);
            else
                return 4 * (8 - (startNum - destNum));
        } else {
            if ((destNum - startNum) <= 4)
                return 4 * (destNum - startNum);
            else
                return 4 * (8 - (destNum - startNum));
        }
    }

    public static Boolean checkMachine(int startTime, int endTime, String s, List<Machine> machineList) {
        boolean d = false;
        if (machineList.size() == 0)
            d = true;
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                if (machine.getWorkingList().get(machine.getWorkingList().size() - 1).getEndTime() + 50 <= startTime - 50)
                    d = true;
            }
        }
        return d;
    }

    public static Boolean checkMachine_TM1(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, List<Distance> distanceList, int specialTime, String specialPosition) {
        boolean d = false;
        if (machineList.size() == 0)
            d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workEndTime = working.getEndTime() + lookDistance(lookLastPosition_TM1(working.getEndTime(), machineList, specialTime, specialPosition), startDest, distanceList);
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - lookDistance(dest, lookNextPosition_TM1(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList), distanceList);
                        if (workEndTime <= startTime && endTime <= workStartTime) {
                            counter = 1;
                        }
                    } else if (workEndTime <= startTime) {
                        counter = 1;
                    }
                }
                if (counter >= 1)
                    d = true;
            }
        }
        return d;
    }

    public static int checkMachine_TM1_Out(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, List<Distance> distanceList, int specialTime, String specialPosition) {
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workEndTime = working.getEndTime() + lookDistance(lookLastPosition_TM1(working.getEndTime(), machineList, specialTime, specialPosition), startDest, distanceList);
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - lookDistance(dest, lookNextPosition_TM1(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList), distanceList);
                        if (workStartTime - workEndTime >= endTime - startTime && workEndTime >= startTime) {
                            startTime = workEndTime;
                            break;
                        }
                    } else {
                        startTime = workEndTime;
                    }
                }
            }
        }
        return startTime;
    }

    public static Boolean checkMachine_TM2(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, int specialTime, String specialPosition) {
        boolean d = false;
        if (machineList.get(1).getWorkingList().size() == 1)
            d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workingEndTime = machine.getWorkingList().indexOf(working) > 0 ? Math.max(working.getEndTime(), machine.getWorkingList().get(machine.getWorkingList().indexOf(working) - 1).getEndTime()) : working.getEndTime();
                    int workEndTime = workingEndTime + Math.min(findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest), 16 - findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest));
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - Math.min(findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)), 16 - findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)));
                        if (workEndTime <= startTime && endTime <= workStartTime) {
                            counter = 1;
                        }
                    } else if (workEndTime <= startTime) {
                        counter = 1;
                    }
                }
                if (counter == 1)
                    d = true;
            }
        }
        return d;
    }

    public static int checkMachine_TM2_Out(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, int specialTime, String specialPosition) {
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workingEndTime = machine.getWorkingList().indexOf(working) > 0 ? Math.max(working.getEndTime(), machine.getWorkingList().get(machine.getWorkingList().indexOf(working) - 1).getEndTime()) : working.getEndTime();
                    int workEndTime = workingEndTime + Math.min(findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest), 16 - findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest));
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - Math.min(findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)), 16 - findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)));
                        if (workStartTime - workEndTime >= endTime - startTime && workEndTime >= startTime) {
                            startTime = workEndTime;
                            break;
                        }
                    } else {
                        startTime = workEndTime;
                    }
                }
            }
        }
        return startTime;
    }

    public static List<Integer> checkMachineSpecial_TM2(int startTime_init, int startTime, int endTime, String s, String startDest, String dest, boolean checkMachine, boolean checkMachineState, List<Machine> machineList, int specialTime, String specialPosition) {
        List<Integer> newTime = new ArrayList<>();
        int startTime_new;
        int endTime_new;
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workingEndTimeSpecial = machine.getWorkingList().indexOf(working) > 0 ? Math.max(working.getEndTime(), machine.getWorkingList().get(machine.getWorkingList().indexOf(working) - 1).getEndTime()) : working.getEndTime();
                    int workEndTime = workingEndTimeSpecial + Math.min(findDistance(lookLastPosition_TM2(workingEndTimeSpecial, machineList, specialTime, specialPosition), startDest), 16 - findDistance(lookLastPosition_TM2(workingEndTimeSpecial, machineList, specialTime, specialPosition), startDest));
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - Math.min(findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)), 16 - findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)));
                        if (workEndTime <= startTime && endTime <= workStartTime) {
                            if (machine.getWorkingList().indexOf(working) == 0)
                                break;
                            int lastWorkingIndex = machine.getWorkingList().indexOf(working) - 1;
                            int lastWorkingEndTime = lastWorkingIndex > 0 ? Math.max(machine.getWorkingList().get(lastWorkingIndex - 1).getEndTime(), machine.getWorkingList().get(lastWorkingIndex).getEndTime()) : machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                            String lastWorkingDest = lookLastPosition_TM2(lastWorkingEndTime, machineList, specialTime, specialPosition);
                            int workingIndex = machine.getWorkingList().indexOf(working);
                            int workingStartTime = machine.getWorkingList().get(workingIndex).getStartTime();
                            int workingEndTime = machine.getWorkingList().get(workingIndex).getEndTime();
                            String workingStartDest = lookNextPosition_TM2(workingStartTime, machineList);
                            String workingDest = lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition);
                            int nextWorkingStartTime = machine.getWorkingList().get(workingIndex + 1).getStartTime();
                            String nextWorkingStartDest = lookNextPosition_TM2(nextWorkingStartTime, machineList);
                            startTime_new = workingStartTime - (16 - findDistance(startDest, workingStartDest) + 50);
                            endTime_new = workingEndTime + 16 - findDistance(workingDest, dest) + 50;
                            boolean bool1 = (lastWorkingEndTime + Math.min(findDistance(lastWorkingDest, startDest), 16 - findDistance(lastWorkingDest, startDest))) <= startTime_new;
                            boolean bool2 = (nextWorkingStartTime - Math.min(findDistance(dest, nextWorkingStartDest), 16 - findDistance(dest, nextWorkingStartDest))) >= endTime_new;
                            boolean bool3 = (endTime_new - 50 >= lookLastTime(lookWorkingListSize(dest, machineList) - 1, dest, machineList) + 50);
                            boolean bool4 = checkMachine ? (checkMachineState ? checkMachineState1(startTime_new, startDest, machineList) : checkMachineState1(endTime_new - 50, dest, machineList)) : true;
                            boolean bool5 = startTime_new >= startTime_init;
                            if (bool1 && bool2 && bool3 && bool4 && bool5) {
                                newTime.add(startTime_new);
                                newTime.add(endTime_new);
                            }
                            if (lastWorkingIndex == 0)
                                break;
                            do {
                                lastWorkingIndex = lastWorkingIndex - 1;
                                lastWorkingEndTime = lastWorkingIndex > 0 ? Math.max(machine.getWorkingList().get(lastWorkingIndex - 1).getEndTime(), machine.getWorkingList().get(lastWorkingIndex).getEndTime()) : machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                lastWorkingDest = lookLastPosition_TM2(lastWorkingEndTime, machineList, specialTime, specialPosition);
                                workingIndex = workingIndex - 1;
                                workingStartTime = machine.getWorkingList().get(workingIndex).getStartTime();
                                workingEndTime = machine.getWorkingList().get(workingIndex).getEndTime();
                                workingStartDest = lookNextPosition_TM2(workingStartTime, machineList);
                                workingDest = lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition);
                                startTime_new = workingStartTime - (16 - findDistance(startDest, workingStartDest) + 50);
                                endTime_new = workingEndTime + 16 - findDistance(workingDest, dest) + 50;
                                nextWorkingStartTime = machine.getWorkingList().get(workingIndex + 1).getStartTime();
                                nextWorkingStartDest = lookNextPosition_TM2(nextWorkingStartTime, machineList);
                                bool1 = (lastWorkingEndTime + Math.min(findDistance(lastWorkingDest, startDest), 16 - findDistance(lastWorkingDest, startDest))) <= startTime_new;
                                bool2 = (nextWorkingStartTime - Math.min(findDistance(dest, nextWorkingStartDest), 16 - findDistance(dest, nextWorkingStartDest))) >= endTime_new;
                                bool3 = (endTime_new - 50 >= lookLastTime(lookWorkingListSize(dest, machineList) - 1, dest, machineList) + 50);
                                bool4 = checkMachine ? (checkMachineState ? checkMachineState1(startTime_new, startDest, machineList) : checkMachineState1(endTime_new - 50, dest, machineList)) : true;
                                bool5 = startTime_new >= startTime_init;
                                if (bool1 && bool2 && bool3 && bool4 && bool5) {
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                }
                            } while (startTime_new > startTime_init && lastWorkingIndex != 0);
                        }
                    } else if (workEndTime <= startTime) {
                        int nextWorkingStartTime;
                        String nextWorkingStartDest;
                        boolean bool5;
                        int lastWorkingIndex = machine.getWorkingList().indexOf(working) - 1;
                        int lastWorkingEndTime = lastWorkingIndex > 0 ? Math.max(machine.getWorkingList().get(lastWorkingIndex - 1).getEndTime(), machine.getWorkingList().get(lastWorkingIndex).getEndTime()) : machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                        String lastWorkingDest = lookLastPosition_TM2(lastWorkingEndTime, machineList, specialTime, specialPosition);
                        int workingIndex = machine.getWorkingList().indexOf(working);
                        int workingStartTime = machine.getWorkingList().get(workingIndex).getStartTime();
                        int workingEndTime = machine.getWorkingList().get(workingIndex).getEndTime();
                        String workingStartDest = lookNextPosition_TM2(workingStartTime, machineList);
                        String workingDest = lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition);
                        startTime_new = workingStartTime - (16 - findDistance(startDest, workingStartDest) + 50);
                        endTime_new = workingEndTime + 16 - findDistance(workingDest, dest) + 50;
                        boolean bool1 = (lastWorkingEndTime + Math.min(findDistance(lastWorkingDest, startDest), 16 - findDistance(lastWorkingDest, startDest))) <= startTime_new;
                        boolean bool2 = (endTime_new - 50 >= lookLastTime(lookWorkingListSize(dest, machineList) - 1, dest, machineList) + 50);
                        boolean bool3 = checkMachine ? (checkMachineState ? checkMachineState1(startTime_new, startDest, machineList) : checkMachineState1(endTime_new - 50, dest, machineList)) : true;
                        boolean bool4 = startTime_new >= startTime_init;
                        if (bool1 && bool2 && bool3 && bool4) {
                            newTime.add(startTime_new);
                            newTime.add(endTime_new);
                        }
                        if (lastWorkingIndex == 0)
                            break;
                        do {
                            lastWorkingIndex = lastWorkingIndex - 1;
                            lastWorkingEndTime = lastWorkingIndex > 0 ? Math.max(machine.getWorkingList().get(lastWorkingIndex - 1).getEndTime(), machine.getWorkingList().get(lastWorkingIndex).getEndTime()) : machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                            lastWorkingDest = lookLastPosition_TM2(lastWorkingEndTime, machineList, specialTime, specialPosition);
                            workingIndex = workingIndex - 1;
                            workingStartTime = machine.getWorkingList().get(workingIndex).getStartTime();
                            workingEndTime = machine.getWorkingList().get(workingIndex).getEndTime();
                            workingStartDest = lookNextPosition_TM2(workingStartTime, machineList);
                            workingDest = lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition);
                            startTime_new = workingStartTime - (16 - findDistance(startDest, workingStartDest) + 50);
                            endTime_new = workingEndTime + 16 - findDistance(workingDest, dest) + 50;
                            nextWorkingStartTime = machine.getWorkingList().get(workingIndex + 1).getStartTime();
                            nextWorkingStartDest = lookNextPosition_TM2(nextWorkingStartTime, machineList);
                            bool1 = (lastWorkingEndTime + Math.min(findDistance(lastWorkingDest, startDest), 16 - findDistance(lastWorkingDest, startDest))) <= startTime_new;
                            bool2 = (endTime_new - 50 >= lookLastTime(lookWorkingListSize(dest, machineList) - 1, dest, machineList) + 50);
                            bool3 = checkMachine ? (checkMachineState ? checkMachineState1(startTime_new, startDest, machineList) : checkMachineState1(endTime_new - 50, dest, machineList)) : true;
                            bool4 = startTime_new >= startTime_init;
                            bool5 = (nextWorkingStartTime - Math.min(findDistance(dest, nextWorkingStartDest), 16 - findDistance(dest, nextWorkingStartDest))) >= endTime_new;
                            if (bool1 && bool2 && bool3 && bool4 && bool5) {
                                newTime.add(startTime_new);
                                newTime.add(endTime_new);
                            }
                        } while (startTime_new > startTime_init && lastWorkingIndex != 0);
                    }
                }
            }
        }
        return newTime;
    }

    public static List<Integer> checkMachineDelay_TM2(int startTime_init, int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, int specialTime, String specialPosition) {
        List<Integer> newTime = new ArrayList<>();
        int startTime_new;
        int endTime_new;
        int delayTime;
        for (Machine machine : machineList) {
            if (s.contains(machine.getMachine())) {
                for (Working working : machine.getWorkingList()) {
                    int workingEndTime = machine.getWorkingList().indexOf(working) > 0 ? Math.max(working.getEndTime(), machine.getWorkingList().get(machine.getWorkingList().indexOf(working) - 1).getEndTime()) : working.getEndTime();
                    int workEndTime = workingEndTime + Math.min(findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest), 16 - findDistance(lookLastPosition_TM2(workingEndTime, machineList, specialTime, specialPosition), startDest));
                    if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                        int workStartTime = machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime() - Math.min(findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)), 16 - findDistance(dest, lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working) + 1).getStartTime(), machineList)));
                        if (workEndTime <= startTime && endTime <= workStartTime) {
                            int workingIndex = machine.getWorkingList().indexOf(working);
                            boolean bool1 = workingIndex + 2 == machine.getWorkingList().size();
                            boolean bool2 = working.getWid().equals(machine.getWorkingList().get(workingIndex + 1).getWid());
                            boolean bool3 = workingIndex == 0 || working.getStartTime() >= machine.getWorkingList().get(workingIndex - 1).getEndTime();
                            String workingStartDest = lookNextPosition_TM2(working.getStartTime(), machineList);
                            String workingDest = lookLastPosition_TM2(working.getEndTime(), machineList, specialTime, specialPosition);
                            if (bool1 && bool2 && bool3) {
                                startTime_new = working.getStartTime() + 50 + (16 - findDistance(workingStartDest, startDest));
                                delayTime = startTime_new + 50 + (16 - findDistance(startDest, workingDest)) + 50 - working.getEndTime();
                                endTime_new = working.getEndTime() + delayTime + (16 - findDistance(workingDest, dest)) + 50;
                                boolean bool4 = startTime_init <= startTime_new;
                                boolean bool5 = checkMachineState1(startTime_new, startDest, machineList);
                                boolean bool6 = endTime_new - 50 >= lookLastTime(lookWorkingListSize(dest, machineList) - 1, dest, machineList) + 50;
                                if (bool4 && bool5 && bool6) {
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                    newTime.add(delayTime);
                                }
                            }
                        }
                    } else if (workEndTime <= startTime) {
                        break;
                    }
                }

            }
        }
        return newTime;
    }

    public static Boolean checkMachineState(int arrivalTime, String s, List<Machine> machineList) {
        boolean d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (machine.getMachine().contains(s + "(S1)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((arrivalTime >= working.getStartTime() - 200 && working.getStartTime() + 200 >= arrivalTime + 50) || (arrivalTime + 50 > working.getStartTime() - 200 && arrivalTime < working.getStartTime() - 200) || (arrivalTime < working.getStartTime() + 200 && arrivalTime + 50 > working.getStartTime() + 200))
                            counter++;
                    }
                }
            } else if (machine.getMachine().contains(s + "(S2)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((arrivalTime >= working.getEndTime() - 150 && working.getEndTime() + 250 >= arrivalTime + 50) || (arrivalTime + 50 > working.getEndTime() - 150 && arrivalTime < working.getEndTime() - 150) || (arrivalTime < working.getEndTime() + 250 && arrivalTime + 50 > working.getEndTime() + 250))
                            counter++;
                    }
                }
            }
        }
        if (counter != 0)
            d = false;
        return d;
    }

    public static int checkMachineState_Out(int arrivalTime, String s, List<Machine> machineList) {
        boolean d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (machine.getMachine().contains(s + "(S1)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((arrivalTime >= working.getStartTime() - 200 && working.getStartTime() + 200 >= arrivalTime + 50) || (arrivalTime + 50 > working.getStartTime() - 200 && arrivalTime < working.getStartTime() - 200) || (arrivalTime < working.getStartTime() + 200 && arrivalTime + 50 > working.getStartTime() + 200))
                            arrivalTime = working.getStartTime() + 200;
                    }
                }
            } else if (machine.getMachine().contains(s + "(S2)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((arrivalTime >= working.getEndTime() - 150 && working.getEndTime() + 250 >= arrivalTime + 50) || (arrivalTime + 50 > working.getEndTime() - 150 && arrivalTime < working.getEndTime() - 150) || (arrivalTime < working.getEndTime() + 250 && arrivalTime + 50 > working.getEndTime() + 250))
                            arrivalTime = working.getEndTime() + 250;
                    }
                }
            }
        }
        if (counter != 0)
            d = false;
        return arrivalTime;
    }

    public static Boolean checkMachineState1(int leaveTime, String s, List<Machine> machineList) {
        boolean d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (machine.getMachine().contains(s + "(S2)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((leaveTime >= working.getStartTime() - 250 && working.getStartTime() + 150 >= leaveTime + 50) || (leaveTime + 50 > working.getStartTime() - 250 && leaveTime < working.getStartTime() - 250) || (leaveTime < working.getStartTime() + 150 && leaveTime + 50 > working.getStartTime() + 150))
                            counter++;
                    }
                }
            } else if (machine.getMachine().contains(s + "(S1)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((leaveTime >= working.getEndTime() - 200 && working.getEndTime() + 200 >= leaveTime + 50) || (leaveTime + 50 > working.getEndTime() - 200 && leaveTime < working.getEndTime() - 200) || (leaveTime < working.getEndTime() + 200 && leaveTime + 50 > working.getEndTime() + 200))
                            counter++;
                    }
                }
            }
        }
        if (counter != 0)
            d = false;
        return d;
    }

    public static int checkMachineState1_Out(int leaveTime, String s, List<Machine> machineList) {
        boolean d = true;
        int counter = 0;
        for (Machine machine : machineList) {
            if (machine.getMachine().contains(s + "(S2)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((leaveTime >= working.getStartTime() - 250 && working.getStartTime() + 150 >= leaveTime + 50) || (leaveTime + 50 > working.getStartTime() - 250 && leaveTime < working.getStartTime() - 250) || (leaveTime < working.getStartTime() + 150 && leaveTime + 50 > working.getStartTime() + 150))
                            leaveTime = working.getStartTime() + 150;
                    }
                }
            } else if (machine.getMachine().contains(s + "(S1)")) {
                if (machine.getWorkingList().size() == 0)
                    d = true;
                else {
                    for (Working working : machine.getWorkingList()) {
                        if ((leaveTime >= working.getEndTime() - 200 && working.getEndTime() + 200 >= leaveTime + 50) || (leaveTime + 50 > working.getEndTime() - 200 && leaveTime < working.getEndTime() - 200) || (leaveTime < working.getEndTime() + 200 && leaveTime + 50 > working.getEndTime() + 200))
                            leaveTime = working.getEndTime() + 200;
                    }
                }
            }
        }
        if (counter != 0)
            d = false;
        return leaveTime;
    }

    public static String changeLL(String sourcePosition, int startTime, List<Machine> machineList, List<Distance> distanceTable, int specialTime, String specialPosition) {
        int startTime1 = startTime;
        int startTime2 = startTime;
        int endTime1;
        int endTime2;
        endTime1 = startTime1 + 50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50;
        boolean b1 = checkMachineState(endTime1 - 50, "LLA", machineList);
        boolean b2 = (lookLastTime(lookWorkingListSize("LLA" + "(S2)", machineList) - 1, "LLA" + "(S2)", machineList) + 250 <= endTime1 - 50);
        boolean b3 = checkMachine_TM1(startTime1, endTime1, "TM1", sourcePosition, "LLA", machineList, distanceTable, specialTime, specialPosition);
        if (b1 && b2 && b3) {

        } else {
            endTime1 = lookLastTime(lookWorkingListSize("LLA" + "(S2)", machineList) - 1, "LLA" + "(S2)", machineList) + 50 + 200 + 50;
            startTime1 = endTime1 - (50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50);
            if (startTime1 < startTime) {
                startTime1 = startTime;
                endTime1 = startTime1 + 50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachineState(endTime1 - 50, "LLA", machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState_Out(endTime1 - 50, "LLA", machineList) + 50 - (50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50));
                if (!checkMachine_TM1(startTime1, endTime1, "TM1", sourcePosition, "LLA", machineList, distanceTable, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime1, endTime1, "TM1", sourcePosition, "LLA", machineList, distanceTable, specialTime, specialPosition));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50;
            } while (!(checkMachineState(endTime1 - 50, "LLA", machineList) && checkMachine_TM1(startTime1, endTime1, "TM1", sourcePosition, "LLA", machineList, distanceTable, specialTime, specialPosition)));
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b1 = checkMachineState(endTime1 - 50, "LLA", machineList);
                b3 = checkMachine_TM1(startTime1, endTime1, "TM1", sourcePosition, "LLA", machineList, distanceTable, specialTime, specialPosition);
                if (b1 && b3) {
                    break TM1;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + lookDistance(sourcePosition, "LLA", distanceTable) + 50);
                }
                if (j == 9999) {
                    System.out.println("AL->LL(S2):TM1阈值过小!!!");
                }
            }
        }
        endTime2 = startTime2 + 50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50;
        boolean b4 = checkMachineState(endTime2 - 50, "LLB", machineList);
        boolean b5 = (lookLastTime(lookWorkingListSize("LLB" + "(S2)", machineList) - 1, "LLB" + "(S2)", machineList) + 250 <= endTime2 - 50);
        boolean b6 = checkMachine_TM1(startTime2, endTime2, "TM1", sourcePosition, "LLB", machineList, distanceTable, specialTime, specialPosition);
        if (b4 && b5 && b6) {

        } else {
            endTime2 = lookLastTime(lookWorkingListSize("LLB" + "(S2)", machineList) - 1, "LLB" + "(S2)", machineList) + 50 + 200 + 50;
            startTime2 = endTime2 - (50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50);
            if (startTime2 < startTime) {
                startTime2 = startTime;
                endTime2 = startTime2 + 50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachineState(endTime2 - 50, "LLB", machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState_Out(endTime2 - 50, "LLB", machineList) + 50 - (50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50));
                if (!checkMachine_TM1(startTime2, endTime2, "TM1", sourcePosition, "LLB", machineList, distanceTable, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM1_Out(startTime2, endTime2, "TM1", sourcePosition, "LLB", machineList, distanceTable, specialTime, specialPosition));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50;
            } while (!(checkMachineState(endTime2 - 50, "LLB", machineList) && checkMachine_TM1(startTime2, endTime2, "TM1", sourcePosition, "LLB", machineList, distanceTable, specialTime, specialPosition)));
            //改动部分
            TM1:
            for (int j = 0; j < 10000; j++) {
                b4 = checkMachineState(endTime2 - 50, "LLB", machineList);
                b6 = checkMachine_TM1(startTime2, endTime2, "TM1", sourcePosition, "LLB", machineList, distanceTable, specialTime, specialPosition);
                if (b4 && b6) {
                    break TM1;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + lookDistance(sourcePosition, "LLB", distanceTable) + 50);
                }
                if (j == 9999) {
                    System.out.println("AL->LL(S2):TM1阈值过小!!!");
                }
            }
        }
        if (endTime1 <= endTime2)
            return "LLA";
        else
            return "LLB";
    }

    public static String changeLL1(String sourcePosition, int startTime, List<Machine> machineList, int specialTime, String specialPosition) {
        int startTime1 = startTime;
        int startTime2 = startTime;
        int endTime1;
        int endTime2;
        endTime1 = startTime1 + 50 + findDistance(sourcePosition, "LLA") + 50;
        boolean b1 = (endTime1 - 50 >= lookLastTime(lookWorkingListSize("LLA" + "(S1)", machineList) - 1, "LLA" + "(S1)", machineList) + 200);
        boolean b2 = checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "LLA", machineList, specialTime, specialPosition);
        boolean b3 = checkMachineState1(endTime1 - 50, "LLA", machineList);
        if (b1 && b2 && b3) {

        } else {
            endTime1 = lookLastTime(lookWorkingListSize("LLA" + "(S1)", machineList) - 1, "LLA" + "(S1)", machineList) + 200 + 50;
            startTime1 = endTime1 - (50 + findDistance(sourcePosition, "LLA") + 50);
            if (startTime1 < startTime) {
                startTime1 = startTime;
                endTime1 = startTime1 + 50 + findDistance(sourcePosition, "LLA") + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "LLA", machineList, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime1, endTime1, "TM2", sourcePosition, "LLA", machineList, specialTime, specialPosition));
                if (!checkMachineState1(endTime1 - 50, "LLA", machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(endTime1 - 50, "LLA", machineList) + 50 - (50 + findDistance(sourcePosition, "LLA") + 50));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + findDistance(sourcePosition, "LLA") + 50;
            } while (!(checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "LLA", machineList, specialTime, specialPosition) && checkMachineState1(endTime1 - 50, "LLA", machineList)));
            //改动部分
            int counter = 0;
//            List<Integer> newTime=checkMachineSpecial_TM2(startTime,startTime1,endTime1,"TM2",sourcePosition,"LLA",true,false,machineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime1=newTime.get(newTime.size()-2);
//                endTime1=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b2 = counter == 1 || checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "LLA", machineList, specialTime, specialPosition);
                b3 = checkMachineState1(endTime1 - 50, "LLA", machineList);
                if (b2 && b3) {

                    break TM2;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + findDistance(sourcePosition, "LLA") + 50);
                }
                if (j == 9999)
                    System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!");
            }
        }
        endTime2 = startTime2 + 50 + findDistance(sourcePosition, "LLB") + 50;
        boolean b4 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize("LLB" + "(S1)", machineList) - 1, "LLB" + "(S1)", machineList) + 200);
        boolean b5 = checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "LLB", machineList, specialTime, specialPosition);
        boolean b6 = checkMachineState1(endTime2 - 50, "LLB", machineList);
        if (b4 && b5 && b6) {

        } else {
            endTime2 = lookLastTime(lookWorkingListSize("LLB" + "(S1)", machineList) - 1, "LLB" + "(S1)", machineList) + 200 + 50;
            startTime2 = endTime2 - (50 + findDistance(sourcePosition, "LLB") + 50);
            if (startTime2 < startTime) {
                startTime2 = startTime;
                endTime2 = startTime2 + 50 + findDistance(sourcePosition, "LLB") + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "LLB", machineList, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", sourcePosition, "LLB", machineList, specialTime, specialPosition));
                if (!checkMachineState1(endTime2 - 50, "LLB", machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(endTime2 - 50, "LLB", machineList) + 50 - (50 + findDistance(sourcePosition, "LLB") + 50));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + findDistance(sourcePosition, "LLB") + 50;
            } while (!(checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "LLB", machineList, specialTime, specialPosition) && checkMachineState1(endTime2 - 50, "LLB", machineList)));
            //改动部分
            int counter = 0;
//            List<Integer> newTime=checkMachineSpecial_TM2(startTime,startTime2,endTime2,"TM2",sourcePosition,"LLB",true,false,machineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime2=newTime.get(newTime.size()-2);
//                endTime2=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter == 1 || checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "LLB", machineList, specialTime, specialPosition);
                b6 = checkMachineState1(endTime2 - 50, "LLB", machineList);
                if (b5 && b6) {

                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(sourcePosition, "LLB") + 50);
                }
                if (j == 9999)
                    System.out.println("PM1/2/5/6->LL(S1):TM2阈值过小!!!");
            }
        }
        if (endTime1 <= endTime2)
            return "LLA";
        else
            return "LLB";
    }

    public static String changePM34(String sourcePosition, int startTime, List<Machine> machineList, int specialTime, String specialPosition) {
        int startTime1 = startTime;
        int startTime2 = startTime;
        int endTime1;
        int endTime2;
        endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM3") + 50;
        boolean b1 = (endTime1 - 50 >= lookLastTime(lookWorkingListSize("PM3", machineList) - 1, "PM3", machineList) + 50);
        boolean b2 = checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM3", machineList, specialTime, specialPosition);
        boolean b3 = checkMachineState1(startTime1, sourcePosition, machineList);
        if (b1 && b2 && b3) {

        } else {
            endTime1 = lookLastTime(lookWorkingListSize("PM3", machineList) - 1, "PM3", machineList) + 50 + 50;
            startTime1 = endTime1 - (50 + findDistance(sourcePosition, "PM3") + 50);
            if (startTime1 < startTime) {
                startTime1 = startTime;
                endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM3") + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            do {
                if (!checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM3", machineList, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime1, endTime1, "TM2", sourcePosition, "PM3", machineList, specialTime, specialPosition));
                if (!checkMachineState1(startTime1, sourcePosition, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(startTime1, sourcePosition, machineList));
                startTime1 = startTimeMax;
                endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM3") + 50;
            } while (!(checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM3", machineList, specialTime, specialPosition) && checkMachineState1(startTime1, sourcePosition, machineList)));
            //改动部分
            int counter = 0;
//            List<Integer> newTime=checkMachineSpecial_TM2(startTime,startTime1,endTime1,"TM2",sourcePosition,"PM3",true,true,machineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime1=newTime.get(newTime.size()-2);
//                endTime1=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b2 = counter == 1 || checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM3", machineList, specialTime, specialPosition);
                b3 = checkMachineState1(startTime1, sourcePosition, machineList);
                if (b2 && b3) {
                    break TM2;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + findDistance(sourcePosition, "PM3") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM34阈值过小!!!");
            }
        }
        endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM4") + 50;
        boolean b4 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize("PM4", machineList) - 1, "PM4", machineList) + 50);
        boolean b5 = checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM4", machineList, specialTime, specialPosition);
        boolean b6 = checkMachineState1(startTime2, sourcePosition, machineList);
        if (b4 && b5 && b6) {

        } else {
            endTime2 = lookLastTime(lookWorkingListSize("PM4", machineList) - 1, "PM4", machineList) + 50 + 50;
            startTime2 = endTime2 - (50 + findDistance(sourcePosition, "PM4") + 50);
            if (startTime2 < startTime) {
                startTime2 = startTime;
                endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM4") + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            do {
                if (!checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM4", machineList, specialTime, specialPosition))
                    startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", sourcePosition, "PM4", machineList, specialTime, specialPosition));
                if (!checkMachineState1(startTime2, sourcePosition, machineList))
                    startTimeMax = Math.max(startTimeMax, checkMachineState1_Out(startTime2, sourcePosition, machineList));
                startTime2 = startTimeMax;
                endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM4") + 50;
            } while (!(checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM4", machineList, specialTime, specialPosition) && checkMachineState1(startTime2, sourcePosition, machineList)));
            //改动部分
            int counter = 0;
//            List<Integer> newTime=checkMachineSpecial_TM2(startTime,startTime1,endTime1,"TM2",sourcePosition,"PM4",true,true,machineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime2=newTime.get(newTime.size()-2);
//                endTime2=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:
            for (int j = 0; j < 10000; j++) {
                b5 = counter == 1 || checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM4", machineList, specialTime, specialPosition);
                b6 = checkMachineState1(startTime2, sourcePosition, machineList);
                if (b5 && b6) {
                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(sourcePosition, "PM4") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM34阈值过小!!!");
            }
        }
        if (endTime1 <= endTime2)
            return "PM3";
        else
            return "PM4";
    }

    public static String changePM1256(String sourcePosition, int startTime, List<Machine> machineList, int specialTime, String specialPosition) {
        int startTime1 = startTime;
        int startTime2 = startTime;
        int startTime3 = startTime;
        int startTime4 = startTime;
        int endTime1;
        int endTime2;
        int endTime3;
        int endTime4;
        endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM1") + 50;
        boolean b1 = (endTime1 - 50 >= lookLastTime(lookWorkingListSize("PM1", machineList) - 1, "PM1", machineList) + 50);
        boolean b2 = checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM1", machineList, specialTime, specialPosition);
        if (b1 && b2) {

        } else {
            endTime1 = lookLastTime(lookWorkingListSize("PM1", machineList) - 1, "PM1", machineList) + 50 + 50;
            startTime1 = endTime1 - (50 + findDistance(sourcePosition, "PM1") + 50);
            if (startTime1 < startTime) {
                startTime1 = startTime;
                endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM1") + 50;
            }
            //改动部分
            int startTimeMax = startTime1;
            if (!checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM1", machineList, specialTime, specialPosition))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime1, endTime1, "TM2", sourcePosition, "PM1", machineList, specialTime, specialPosition));
            startTime1 = startTimeMax;
            endTime1 = startTime1 + 50 + findDistance(sourcePosition, "PM1") + 50;
            //改动部分
            TM2:
            for (int j = 0; j < 10000; j++) {
                b2 = checkMachine_TM2(startTime1, endTime1, "TM2", sourcePosition, "PM1", machineList, specialTime, specialPosition);
                if (b2) {
                    break TM2;
                } else {
                    endTime1 = endTime1 + 1;
                    startTime1 = endTime1 - (50 + findDistance(sourcePosition, "PM1") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM1256阈值过小!!!");
            }
        }
        endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM2") + 50;
        boolean b3 = (endTime2 - 50 >= lookLastTime(lookWorkingListSize("PM2", machineList) - 1, "PM2", machineList) + 50);
        boolean b4 = checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM2", machineList, specialTime, specialPosition);
        if (b3 && b4) {

        } else {
            endTime2 = lookLastTime(lookWorkingListSize("PM2", machineList) - 1, "PM2", machineList) + 50 + 50;
            startTime2 = endTime2 - (50 + findDistance(sourcePosition, "PM2") + 50);
            if (startTime2 < startTime) {
                startTime2 = startTime;
                endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM2") + 50;
            }
            //改动部分
            int startTimeMax = startTime2;
            if (!checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM2", machineList, specialTime, specialPosition))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime2, endTime2, "TM2", sourcePosition, "PM2", machineList, specialTime, specialPosition));
            startTime2 = startTimeMax;
            endTime2 = startTime2 + 50 + findDistance(sourcePosition, "PM2") + 50;
            //改动部分
            TM2:
            for (int j = 0; j < 10000; j++) {
                b4 = checkMachine_TM2(startTime2, endTime2, "TM2", sourcePosition, "PM2", machineList, specialTime, specialPosition);
                if (b4) {
                    break TM2;
                } else {
                    endTime2 = endTime2 + 1;
                    startTime2 = endTime2 - (50 + findDistance(sourcePosition, "PM2") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM1256阈值过小!!!");
            }
        }
        endTime3 = startTime3 + 50 + findDistance(sourcePosition, "PM5") + 50;
        boolean b5 = (endTime3 - 50 >= lookLastTime(lookWorkingListSize("PM5", machineList) - 1, "PM5", machineList) + 50);
        boolean b6 = checkMachine_TM2(startTime3, endTime3, "TM2", sourcePosition, "PM5", machineList, specialTime, specialPosition);
        if (b5 && b6) {

        } else {
            endTime3 = lookLastTime(lookWorkingListSize("PM5", machineList) - 1, "PM5", machineList) + 50 + 50;
            startTime3 = endTime3 - (50 + findDistance(sourcePosition, "PM5") + 50);
            if (startTime3 < startTime) {
                startTime3 = startTime;
                endTime3 = startTime3 + 50 + findDistance(sourcePosition, "PM5") + 50;
            }
            //改动部分
            int startTimeMax = startTime3;
            if (!checkMachine_TM2(startTime3, endTime3, "TM2", sourcePosition, "PM5", machineList, specialTime, specialPosition))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime3, endTime3, "TM2", sourcePosition, "PM5", machineList, specialTime, specialPosition));
            startTime3 = startTimeMax;
            endTime3 = startTime3 + 50 + findDistance(sourcePosition, "PM5") + 50;
            //改动部分
            TM2:
            for (int j = 0; j < 10000; j++) {
                b6 = checkMachine_TM2(startTime3, endTime3, "TM2", sourcePosition, "PM5", machineList, specialTime, specialPosition);
                if (b6) {
                    break TM2;
                } else {
                    endTime3 = endTime3 + 1;
                    startTime3 = endTime3 - (50 + findDistance(sourcePosition, "PM5") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM1256阈值过小!!!");
            }
        }
        endTime4 = startTime4 + 50 + findDistance(sourcePosition, "PM6") + 50;
        boolean b7 = (endTime4 - 50 >= lookLastTime(lookWorkingListSize("PM6", machineList) - 1, "PM6", machineList) + 50);
        boolean b8 = checkMachine_TM2(startTime4, endTime4, "TM2", sourcePosition, "PM6", machineList, specialTime, specialPosition);
        if (b7 && b8) {

        } else {
            endTime4 = lookLastTime(lookWorkingListSize("PM6", machineList) - 1, "PM6", machineList) + 50 + 50;
            startTime4 = endTime4 - (50 + findDistance(sourcePosition, "PM6") + 50);
            if (startTime4 < startTime) {
                startTime4 = startTime;
                endTime4 = startTime4 + 50 + findDistance(sourcePosition, "PM6") + 50;
            }
            //改动部分
            int startTimeMax = startTime4;
            if (!checkMachine_TM2(startTime4, endTime4, "TM2", sourcePosition, "PM6", machineList, specialTime, specialPosition))
                startTimeMax = Math.max(startTimeMax, checkMachine_TM2_Out(startTime4, endTime4, "TM2", sourcePosition, "PM6", machineList, specialTime, specialPosition));
            startTime4 = startTimeMax;
            endTime4 = startTime4 + 50 + findDistance(sourcePosition, "PM6") + 50;
            //改动部分
            TM2:
            for (int j = 0; j < 10000; j++) {
                b8 = checkMachine_TM2(startTime4, endTime4, "TM2", sourcePosition, "PM6", machineList, specialTime, specialPosition);
                if (b8) {
                    break TM2;
                } else {
                    endTime4 = endTime4 + 1;
                    startTime4 = endTime4 - (50 + findDistance(sourcePosition, "PM6") + 50);
                }
                if (j == 9999)
                    System.out.println("changeTM1256阈值过小!!!");
            }
        }
        double min = Math.min(Math.min(endTime1, endTime2), Math.min(endTime3, endTime4));
        if (min == endTime2)
            return "PM2";
        else if (min == endTime3)
            return "PM5";
        else if (min == endTime1)
            return "PM1";
        else
            return "PM6";
    }

    public static boolean[] ordering_AmachineToGene(List<Ordering_Amachine> orderingAmachines) {
        boolean[] gene = new boolean[orderingAmachines.size() * 5];
        int counter = 0;
        for (Ordering_Amachine orderingAmachine : orderingAmachines) {
            if (orderingAmachine.getFinalPosition0() == "LLA")
                gene[counter] = true;
            else
                gene[counter] = false;
            counter++;
            if (orderingAmachine.getFinalPosition1() == "PM3")
                gene[counter] = true;
            else
                gene[counter] = false;
            counter++;
            if (orderingAmachine.getFinalPosition2() == "PM1") {
                gene[counter++] = true;
                gene[counter] = true;
            } else if (orderingAmachine.getFinalPosition2() == "PM2") {
                gene[counter++] = false;
                gene[counter] = true;
            } else if (orderingAmachine.getFinalPosition2() == "PM5") {
                gene[counter++] = true;
                gene[counter] = false;
            } else {
                gene[counter++] = false;
                gene[counter] = false;
            }
            counter++;
            if (orderingAmachine.getFinalPosition3() == "LLA")
                gene[counter] = true;
            else
                gene[counter] = false;
            counter++;
        }
        return gene;
    }
}

