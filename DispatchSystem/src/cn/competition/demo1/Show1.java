package cn.competition.demo1;

import cn.competition.demo.Machine;
import cn.competition.demo.Procedure;
import cn.competition.demo.Working;
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

import static cn.competition.demo.Show.*;

public class Show1 {
    public static List<Machine> procedureListToMachineList(int procedureNum,List<Procedure> procedureList){
        List<Machine> machineList = new ArrayList<>();
        for (Procedure procedure : procedureList) {
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Machine machine : machineList) {
                if (procedure.getProcedure().equals(machine.getMachine())) {
                    Working working1 = new Working(procedureList.indexOf(procedure) / procedureNum, procedure.getStime(), procedure.getEtime());
                    machine.getWorkingList().add(working1);
                    counter++;
                }
            }
            if (counter == 0) {
                Working working = new Working(procedureList.indexOf(procedure) / procedureNum, procedure.getStime(), procedure.getEtime());
                workingList.add(working);
                Machine machine1 = new Machine(procedure.getProcedure(), workingList);
                machineList.add(machine1);
            }
        }
        machineList = resort(machineList);
        return machineList;
    }
    public static List<Machine> cleanMachine(String machine,List<Machine> machineList,List<Cleaning> cleanList,int startTime){
        List<Machine> cleanMachineList = new ArrayList<>();
        if (lookWorkingListSize(machine,machineList)%15==0){
            cleanList.add(new Cleaning(machine,3000,startTime,startTime+3000));
        }
        for (Cleaning cleaning:cleanList) {
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Machine machine1:cleanMachineList){
                if (cleaning.getMachine().equals(machine1.getMachine())){
                    Working working=new Working(machine1.getWorkingList().size()+1,cleaning.getStartTime(),cleaning.getEndTime());
                    machine1.getWorkingList().add(working);
                    counter++;
                }
            }
            if (counter==0){
                Working working1=new Working(1,cleaning.getStartTime(),cleaning.getEndTime());
                workingList.add(working1);
                Machine machine2=new Machine(cleaning.getMachine(),workingList);
                cleanMachineList.add(machine2);
            }
        }
        cleanMachineList=resort(cleanMachineList);
        return cleanMachineList;
    }
    public static List<Machine> cleaningListToCleanMachineList(List<Cleaning> cleanList){
        List<Machine> cleanMachineList = new ArrayList<>();
        for (Cleaning cleaning:cleanList) {
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Machine machine1:cleanMachineList){
                if (cleaning.getMachine().equals(machine1.getMachine())){
                    Working working=new Working(machine1.getWorkingList().size()+1,cleaning.getStartTime(),cleaning.getEndTime());
                    machine1.getWorkingList().add(working);
                    counter++;
                }
            }
            if (counter==0){
                Working working1=new Working(1,cleaning.getStartTime(),cleaning.getEndTime());
                workingList.add(working1);
                Machine machine2=new Machine(cleaning.getMachine(),workingList);
                cleanMachineList.add(machine2);
            }
        }
        cleanMachineList=resort(cleanMachineList);
        return cleanMachineList;
    }
    public static List<Machine> resort(List<Machine> machineList){
        List<Machine> machineList1 = new ArrayList<>();
        for (Machine machine : machineList) {
            int[] temp = new int[machine.getWorkingList().size()];
            int counter = 0;
            List<Working> workingList = new ArrayList<>();
            for (Working working : machine.getWorkingList()) {
                if (machine.getMachine().contains("LLC")){
                    temp[counter] = working.getStartTime();
                    counter++;
                }else if (working.getStartTime() != working.getEndTime()) {
                    temp[counter] = working.getStartTime();
                    counter++;
                }
            }
            Arrays.sort(temp);
            for (int i = 0; i < temp.length; i++) {
                for (Working working : machine.getWorkingList()){
                    if (working.getStartTime()==temp[i])
                        workingList.add(working);
                }
            }
            machineList1.add(new Machine(machine.getMachine(),workingList));
        }
        return machineList1;
    }
    public static List<Procedure> read(int lastRowNum,String path, int waferNum) throws IOException {
        List<Procedure> procedureList = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(path);
        XSSFSheet sheet = workbook.getSheetAt(0);
        //int lastRowNum = 18;//sheet.getLastRowNum();
        for (int j = 0; j < waferNum; j++) {
            for (int i = 1; i <= lastRowNum; i++) {
                XSSFRow row = sheet.getRow(i);
                if(row != null){
                    List<String> list = new ArrayList<>();
                    for (Cell cell : row) {
                        if(cell != null) {
                            cell.setCellType(CellType.STRING);
                            String value = cell.getStringCellValue();
                            if (value != null && !"".equals(value)) {
                                list.add(value);
                            }
                        }
                    }
                    if (list.size()>0) {
                        Procedure procedure = new Procedure(String.valueOf(list.get(0+5*j)),Integer.parseInt(list.get(1+5*j)), Integer.parseInt(list.get(2+5*j)), Integer.parseInt(list.get(3+5*j)), Integer.parseInt(list.get(4+5*j)));
                        procedureList.add(procedure);
                    }
                }
            }
        }
        return procedureList;
    }
    public static void write(int procedureNum,List<Procedure> procedureList, String path, int wafer) throws IOException {
        wafer--;
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFRow xssfRow = wafer==0?xssfSheet.createRow(0):xssfSheet.getRow(0);
        xssfRow.createCell(0 + 5 * wafer).setCellValue("Procedures");
        xssfRow.createCell(1 + 5 * wafer).setCellValue("MID");
        xssfRow.createCell(2 + 5 * wafer).setCellValue("Ctime");
        xssfRow.createCell(3 + 5 * wafer).setCellValue("Stime");
        xssfRow.createCell(4 + 5 * wafer).setCellValue("Etime");
        for (int j = 0; j < procedureNum; j++) {
            XSSFRow xssfRow1 = wafer==0?xssfSheet.createRow(j + 1):xssfSheet.getRow(j+1);
            xssfRow1.createCell(0 + 5 * wafer).setCellValue(procedureList.get(procedureNum * wafer + j).getProcedure());
            xssfRow1.createCell(1 + 5 * wafer).setCellValue(procedureList.get(procedureNum * wafer + j).getMid());
            xssfRow1.createCell(2 + 5 * wafer).setCellValue(procedureList.get(procedureNum * wafer + j).getCtime()/10.0);
            xssfRow1.createCell(3 + 5 * wafer).setCellValue(procedureList.get(procedureNum * wafer + j).getStime()/10.0);
            xssfRow1.createCell(4 + 5 * wafer).setCellValue(procedureList.get(procedureNum * wafer + j).getEtime()/10.0);
        }
        XSSFRow xssfRow1 = wafer==0?xssfSheet.createRow( procedureNum+1):xssfSheet.getRow(procedureNum+1);
        xssfRow1.createCell(0 + 5 * wafer).setCellValue("晶圆"+(wafer+1));
        xssfRow1.createCell(3+5*wafer).setCellValue("总时间");
        xssfRow1.createCell(4+5*wafer).setCellValue(procedureList.get(procedureNum * (wafer+1) -1).getEtime()/10.0-procedureList.get(procedureNum*wafer).getStime()/10.0);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        xssfWorkbook.close();
    }
    public static int findDistance1(String startDest, String dest) {
        int startNum=0;
        int destNum=0;
        if (startDest.contains("PM")){
            if (startDest.contains("9"))
                startNum=1;
            else if (startDest.contains("7"))
                startNum=2;
            else if (startDest.contains("8"))
                startNum=5;
            else
                startNum=6;
        }else{
            if (startDest.contains("C"))
                startNum=3;
            else if (startDest.contains("D"))
                startNum=4;
            else if (startDest.contains("A"))
                startNum=8;
            else
                startNum=7;
        }
        if (dest.contains("PM")){
            if (dest.contains("9"))
                destNum=1;
            else if (dest.contains("7"))
                destNum=2;
            else if (dest.contains("8"))
                destNum=5;
            else
                destNum=6;
        }else{
            if (dest.contains("C"))
                destNum=3;
            else if (dest.contains("D"))
                destNum=4;
            else if (dest.contains("A"))
                destNum=8;
            else
                destNum=7;
        }
        if (startNum>=destNum) {
            if ((startNum - destNum) <= 4)
                return 4*(startNum - destNum);
            else
                return 4*(8 - (startNum - destNum));
        }else{
            if ((destNum - startNum) <= 4)
                return 4*(destNum - startNum);
            else
                return 4*(8 - (destNum - startNum));
        }
    }
    public static int findDistance2(String startDest, String dest) {
        int startNum=0;
        int destNum=0;
        if (startDest.contains("PM")){
            for (int i = 1; i <= 6; i++) {
                if (startDest.contains(""+i))
                    startNum=i;
            }
        }else{
            if (startDest.contains("C"))
                startNum=8;
            else
                startNum=7;
        }
        if (dest.contains("PM")){
            for (int i = 1; i <= 6; i++) {
                if (dest.contains(""+i))
                    destNum=i;
            }
        }else{
            if (dest.contains("C"))
                destNum=8;
            else
                destNum=7;
        }
        if (startNum>=destNum) {
            if ((startNum - destNum) <= 4)
                return 4*(startNum - destNum);
            else
                return 4*(8 - (startNum - destNum));
        }else{
            if ((destNum - startNum) <= 4)
                return 4*(destNum - startNum);
            else
                return 4*(8 - (destNum - startNum));
        }
    }
    public static Boolean checkMachine_PM(int startTime,String s,List<Machine> cleanMachineList){
        boolean d=false;
        int counter=0;
        for (Machine machine:cleanMachineList){
            if (s.contains(machine.getMachine())){
                if (machine.getWorkingList().get(machine.getWorkingList().size()-1).getEndTime()<=startTime)
                    d=true;
                counter++;
            }
        }
        if (counter==0)
            d=true;
        return d;
    }
    public static int checkMachine_PM_Out(int startTime,String s,List<Machine> cleanMachineList){
        for (Machine machine:cleanMachineList){
            if (s.contains(machine.getMachine())){
                startTime=machine.getWorkingList().get(machine.getWorkingList().size()-1).getEndTime();
            }
        }
        return startTime;
    }
    public static Boolean checkMachine_TM23(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, int specialTime, String specialPosition) {
        boolean d = false;
        if (machineList.get(1).getWorkingList().size()==1)
            d=true;
        int counter = 0;
        if (s.equals("TM2")){
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTime=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTime+Math.min(findDistance1(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest),16-findDistance1(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workEndTime<=startTime&&endTime<=workStartTime) {
                                counter=1;
                            }
                        }else if (workEndTime<=startTime){
                            counter = 1;
                        }
                    }
                    if (counter==1)
                        d=true;
                }
            }
        }
        else{
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTime=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTime+Math.min(findDistance2(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest),16-findDistance2(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workEndTime<=startTime&&endTime<=workStartTime) {
                                counter=1;
                            }
                        }else if (workEndTime<=startTime){
                            counter = 1;
                        }
                    }
                    if (counter==1)
                        d=true;
                }
            }
        }
        return d;
    }
    public static int checkMachine_TM23_Out(int startTime, int endTime, String s, String startDest, String dest, List<Machine> machineList, int specialTime, String specialPosition){
        boolean d = false;
        if (machineList.get(1).getWorkingList().size()==1)
            d=true;
        int counter = 0;
        if (s.equals("TM2")){
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTime=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTime+Math.min(findDistance1(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest),16-findDistance1(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workStartTime-workEndTime>=endTime-startTime&&workEndTime>=startTime) {
                                startTime=workEndTime;
                                break;
                            }
                        }else {
                            startTime=workEndTime;
                        }
                    }
                }
            }
        }
        else{
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTime=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTime+Math.min(findDistance2(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest),16-findDistance2(lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workStartTime-workEndTime>=endTime-startTime&&workEndTime>=startTime) {
                                startTime=workEndTime;
                                break;
                            }
                        }else{
                            startTime=workEndTime;
                        }
                    }
                }
            }
        }
        return startTime;
    }
    public static List<Integer> checkMachineSpecial_TM23(int startTime_init, int startTime, int endTime, String s, String startDest, String dest, boolean checkMachine, boolean checkMachineState, boolean checkMachineCleaning, List<Machine> machineList, List<Machine> cleanMachineList, int specialTime, String specialPosition) {
        List<Integer> newTime=new ArrayList<>();
        int startTime_new;
        int endTime_new;
        if (s.equals("TM2")){
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTimeSpecial=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTimeSpecial+Math.min(findDistance1(lookLastPosition_TM2(workingEndTimeSpecial,machineList,specialTime,specialPosition),startDest),16-findDistance1(lookLastPosition_TM2(workingEndTimeSpecial,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance1(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workEndTime<=startTime&&endTime<=workStartTime) {
                                if (machine.getWorkingList().indexOf(working)==0)
                                    break;
                                int lastWorkingIndex=machine.getWorkingList().indexOf(working)-1;
                                int lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                String lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                int workingIndex=machine.getWorkingList().indexOf(working);
                                int workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                int workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                String workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                String workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                int nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                String nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                startTime_new=workingStartTime-(16-findDistance1(startDest,workingStartDest)+50);
                                endTime_new=workingEndTime+16-findDistance1(workingDest,dest)+50;
                                boolean bool1=(lastWorkingEndTime+Math.min(findDistance1(lastWorkingDest,startDest),16-findDistance1(lastWorkingDest,startDest)))<=startTime_new;
                                boolean bool2=(nextWorkingStartTime-Math.min(findDistance1(dest,nextWorkingStartDest),16-findDistance1(dest,nextWorkingStartDest)))>=endTime_new;
                                boolean bool3=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                boolean bool4= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                boolean bool5=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                boolean bool6=startTime_new>=startTime_init;
                                if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                }
                                if (lastWorkingIndex==0)
                                    break;
                                do {
                                    lastWorkingIndex=lastWorkingIndex-1;
                                    lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                    lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                    workingIndex=workingIndex-1;
                                    workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                    workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                    workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                    workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                    startTime_new=workingStartTime-(16-findDistance1(startDest,workingStartDest)+50);
                                    endTime_new=workingEndTime+16-findDistance1(workingDest,dest)+50;
                                    nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                    nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                    bool1=(lastWorkingEndTime+Math.min(findDistance1(lastWorkingDest,startDest),16-findDistance1(lastWorkingDest,startDest)))<=startTime_new;
                                    bool2=(nextWorkingStartTime-Math.min(findDistance1(dest,nextWorkingStartDest),16-findDistance1(dest,nextWorkingStartDest)))>=endTime_new;
                                    bool3=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                    bool4= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                    bool5=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                    bool6=startTime_new>=startTime_init;
                                    if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                        newTime.add(startTime_new);
                                        newTime.add(endTime_new);
                                    }
                                }while (startTime_new>startTime_init&&lastWorkingIndex !=0);
                            }
                        }else if (workEndTime<=startTime){
                            int nextWorkingStartTime;
                            String nextWorkingStartDest;
                            boolean bool6;
                            int lastWorkingIndex=machine.getWorkingList().indexOf(working)-1;
                            int lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                            String lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                            int workingIndex=machine.getWorkingList().indexOf(working);
                            int workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                            int workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                            String workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                            String workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                            startTime_new=workingStartTime-(16-findDistance1(startDest,workingStartDest)+50);
                            endTime_new=workingEndTime+16-findDistance1(workingDest,dest)+50;
                            boolean bool1=(lastWorkingEndTime+Math.min(findDistance1(lastWorkingDest,startDest),16-findDistance1(lastWorkingDest,startDest)))<=startTime_new;
                            boolean bool2=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                            boolean bool3= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                            boolean bool4=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                            boolean bool5=startTime_new>=startTime_init;
                            if (bool1&&bool2&&bool3&&bool4&&bool5){
                                newTime.add(startTime_new);
                                newTime.add(endTime_new);
                            }
                            if (lastWorkingIndex==0)
                                break;
                            do {
                                lastWorkingIndex=lastWorkingIndex-1;
                                lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                workingIndex=workingIndex-1;
                                workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                startTime_new=workingStartTime-(16-findDistance1(startDest,workingStartDest)+50);
                                endTime_new=workingEndTime+16-findDistance1(workingDest,dest)+50;
                                nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                bool1=(lastWorkingEndTime+Math.min(findDistance1(lastWorkingDest,startDest),16-findDistance1(lastWorkingDest,startDest)))<=startTime_new;
                                bool2=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                bool3= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                bool4=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                bool5=startTime_new>=startTime_init;
                                bool6=(nextWorkingStartTime-Math.min(findDistance1(dest,nextWorkingStartDest),16-findDistance1(dest,nextWorkingStartDest)))>=endTime_new;
                                if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                }
                            }while (startTime_new>startTime_init&&lastWorkingIndex !=0);
                        }
                    }
                }
            }
        }
        else{
            for (Machine machine : machineList) {
                if (s.contains(machine.getMachine())) {
                    for (Working working : machine.getWorkingList()) {
                        int workingEndTimeSpecial=machine.getWorkingList().indexOf(working)>0?Math.max(working.getEndTime(),machine.getWorkingList().get(machine.getWorkingList().indexOf(working)-1).getEndTime()):working.getEndTime();
                        int workEndTime=workingEndTimeSpecial+Math.min(findDistance2(lookLastPosition_TM2(workingEndTimeSpecial,machineList,specialTime,specialPosition),startDest),16-findDistance2(lookLastPosition_TM2(workingEndTimeSpecial,machineList,specialTime,specialPosition),startDest));
                        if ((machine.getWorkingList().indexOf(working) + 1) != machine.getWorkingList().size()) {
                            int workStartTime=machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime()-Math.min(findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)),16-findDistance2(dest,lookNextPosition_TM2(machine.getWorkingList().get(machine.getWorkingList().indexOf(working)+1).getStartTime(),machineList)));
                            if (workEndTime<=startTime&&endTime<=workStartTime) {
                                if (machine.getWorkingList().indexOf(working)==0)
                                    break;
                                int lastWorkingIndex=machine.getWorkingList().indexOf(working)-1;
                                int lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                String lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                int workingIndex=machine.getWorkingList().indexOf(working);
                                int workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                int workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                String workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                String workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                int nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                String nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                startTime_new=workingStartTime-(16-findDistance2(startDest,workingStartDest)+50);
                                endTime_new=workingEndTime+16-findDistance2(workingDest,dest)+50;
                                boolean bool1=(lastWorkingEndTime+Math.min(findDistance2(lastWorkingDest,startDest),16-findDistance2(lastWorkingDest,startDest)))<=startTime_new;
                                boolean bool2=(nextWorkingStartTime-Math.min(findDistance2(dest,nextWorkingStartDest),16-findDistance2(dest,nextWorkingStartDest)))>=endTime_new;
                                boolean bool3=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                boolean bool4= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                boolean bool5=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                boolean bool6=startTime_new>=startTime_init;
                                if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                }
                                if (lastWorkingIndex==0)
                                    break;
                                do {
                                    lastWorkingIndex=lastWorkingIndex-1;
                                    lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                    lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                    workingIndex=workingIndex-1;
                                    workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                    workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                    workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                    workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                    startTime_new=workingStartTime-(16-findDistance2(startDest,workingStartDest)+50);
                                    endTime_new=workingEndTime+16-findDistance2(workingDest,dest)+50;
                                    nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                    nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                    bool1=(lastWorkingEndTime+Math.min(findDistance2(lastWorkingDest,startDest),16-findDistance2(lastWorkingDest,startDest)))<=startTime_new;
                                    bool2=(nextWorkingStartTime-Math.min(findDistance2(dest,nextWorkingStartDest),16-findDistance2(dest,nextWorkingStartDest)))>=endTime_new;
                                    bool3=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                    bool4= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                    bool5=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                    bool6=startTime_new>=startTime_init;
                                    if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                        newTime.add(startTime_new);
                                        newTime.add(endTime_new);
                                    }
                                }while (startTime_new>startTime_init&&lastWorkingIndex !=0);
                            }
                        }else if (workEndTime<=startTime){
                            int nextWorkingStartTime;
                            String nextWorkingStartDest;
                            boolean bool6;
                            int lastWorkingIndex=machine.getWorkingList().indexOf(working)-1;
                            int lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                            String lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                            int workingIndex=machine.getWorkingList().indexOf(working);
                            int workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                            int workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                            String workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                            String workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                            startTime_new=workingStartTime-(16-findDistance2(startDest,workingStartDest)+50);
                            endTime_new=workingEndTime+16-findDistance2(workingDest,dest)+50;
                            boolean bool1=(lastWorkingEndTime+Math.min(findDistance2(lastWorkingDest,startDest),16-findDistance2(lastWorkingDest,startDest)))<=startTime_new;
                            boolean bool2=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                            boolean bool3= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                            boolean bool4=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                            boolean bool5=startTime_new>=startTime_init;
                            if (bool1&&bool2&&bool3&&bool4&&bool5){
                                newTime.add(startTime_new);
                                newTime.add(endTime_new);
                            }
                            if (lastWorkingIndex==0)
                                break;
                            do {
                                lastWorkingIndex=lastWorkingIndex-1;
                                lastWorkingEndTime=lastWorkingIndex>0?Math.max(machine.getWorkingList().get(lastWorkingIndex-1).getEndTime(),machine.getWorkingList().get(lastWorkingIndex).getEndTime()):machine.getWorkingList().get(lastWorkingIndex).getEndTime();
                                lastWorkingDest=lookLastPosition_TM2(lastWorkingEndTime,machineList,specialTime,specialPosition);
                                workingIndex=workingIndex-1;
                                workingStartTime=machine.getWorkingList().get(workingIndex).getStartTime();
                                workingEndTime=machine.getWorkingList().get(workingIndex).getEndTime();
                                workingStartDest=lookNextPosition_TM2(workingStartTime,machineList);
                                workingDest=lookLastPosition_TM2(workingEndTime,machineList,specialTime,specialPosition);
                                startTime_new=workingStartTime-(16-findDistance2(startDest,workingStartDest)+50);
                                endTime_new=workingEndTime+16-findDistance2(workingDest,dest)+50;
                                nextWorkingStartTime=machine.getWorkingList().get(workingIndex+1).getStartTime();
                                nextWorkingStartDest=lookNextPosition_TM2(nextWorkingStartTime,machineList);
                                bool1=(lastWorkingEndTime+Math.min(findDistance2(lastWorkingDest,startDest),16-findDistance2(lastWorkingDest,startDest)))<=startTime_new;
                                bool2=(endTime_new-50>=lookLastTime(lookWorkingListSize(dest,machineList)-1,dest,machineList)+50);
                                bool3= checkMachine?(checkMachineState ?checkMachineState1(startTime_new,startDest,machineList):checkMachineState1(endTime_new-50,dest,machineList)):true;
                                bool4=checkMachineCleaning?checkMachine_PM(endTime_new-50,dest,cleanMachineList):true;
                                bool5=startTime_new>=startTime_init;
                                bool6=(nextWorkingStartTime-Math.min(findDistance2(dest,nextWorkingStartDest),16-findDistance2(dest,nextWorkingStartDest)))>=endTime_new;
                                if (bool1&&bool2&&bool3&&bool4&&bool5&&bool6){
                                    newTime.add(startTime_new);
                                    newTime.add(endTime_new);
                                }
                            }while (startTime_new>startTime_init&&lastWorkingIndex !=0);
                        }
                    }
                }
            }
        }
        return newTime;
    }
    public static String changePM910(String sourcePosition, int startTime, List<Machine> machineList,List<Machine> cleanMachineList,int specialTime,String specialPosition){
        int startTime1=startTime;
        int startTime2=startTime;
        int endTime1;
        int endTime2;
        endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM9") + 50;
        boolean b1=(endTime1-50>=lookLastTime(lookWorkingListSize("PM9",machineList)-1,"PM9",machineList)+50);
        boolean b2=checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM9",machineList,specialTime,specialPosition);
        boolean a1=checkMachine_PM(endTime1-50,"PM9",cleanMachineList);
        if (b1&&b2&&a1) {

        }else {
            endTime1 = lookLastTime(lookWorkingListSize("PM9", machineList)-1, "PM9", machineList)+50+50;
            startTime1 = endTime1-(50 + findDistance1(sourcePosition,"PM9") + 50);
            if (startTime1<startTime){
                startTime1=startTime;
                endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM9") + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM9",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime1,endTime1,"TM2",sourcePosition,"PM9",machineList,specialTime,specialPosition));
                if (!checkMachine_PM(endTime1-50,"PM9",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime1-50,"PM9",cleanMachineList)+50-(50 + findDistance1(sourcePosition,"PM9") + 50));
                startTime1=startTimeMax;
                endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM9") + 50;
            }while (!(checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM9",machineList,specialTime,specialPosition)&&checkMachine_PM(endTime1-50,"PM9",cleanMachineList)));
            //改动部分
            TM2:for (int j = 0; j < 10000; j++) {
                b2=checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM9",machineList,specialTime,specialPosition);
                a1=checkMachine_PM(endTime1-50,"PM9",cleanMachineList);
                if (b2&&a1) {
                    break TM2;
                }else {
                    endTime1=endTime1+1;
                    startTime1 = endTime1-(50 + findDistance1(sourcePosition,"PM9") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM910阈值过小!!!");
            }
        }
        endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM10") + 50;
        boolean b4=(endTime2-50>=lookLastTime(lookWorkingListSize("PM10",machineList)-1,"PM10",machineList)+50);
        boolean b5=checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM10",machineList,specialTime,specialPosition);
        boolean a2=checkMachine_PM(endTime2-50,"PM10",cleanMachineList);
        if (b4&&b5&&a2) {

        }else {
            endTime2 = lookLastTime(lookWorkingListSize("PM10", machineList)-1, "PM10", machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance1(sourcePosition,"PM10") + 50);
            if (startTime2<startTime){
                startTime2=startTime;
                endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM10") + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM10",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM2",sourcePosition,"PM10",machineList,specialTime,specialPosition));
                if (!checkMachine_PM(endTime2-50,"PM10",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,"PM10",cleanMachineList)+50-(50 + findDistance1(sourcePosition,"PM10") + 50));
                startTime2=startTimeMax;
                endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM10") + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM10",machineList,specialTime,specialPosition)&&checkMachine_PM(endTime2-50,"PM10",cleanMachineList)));
            //改动部分
            TM2:for (int j = 0; j < 10000; j++) {
                b5=checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM10",machineList,specialTime,specialPosition);
                a2=checkMachine_PM(endTime2-50,"PM10",cleanMachineList);
                if (b5&&a2) {
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance1(sourcePosition,"PM10") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM910阈值过小!!!");
            }
        }
        if (endTime1<=endTime2)
            return "PM9";
        else
            return "PM10";
    }
    public static String changePM78(String sourcePosition, int startTime, List<Machine> machineList,List<Machine> cleanMachineList,int specialTime,String specialPosition){
        int startTime1=startTime;
        int startTime2=startTime;
        int endTime1;
        int endTime2;
        endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM7") + 50;
        boolean b1=(endTime1-50>=lookLastTime(lookWorkingListSize("PM7",machineList)-1,"PM7",machineList)+50);
        boolean b2=checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM7",machineList,specialTime,specialPosition);
        boolean b3=checkMachineState1(startTime1,sourcePosition,machineList);
        boolean a1=checkMachine_PM(endTime1-50,"PM7",cleanMachineList);
        if (b1&&b2&&b3&&a1) {

        }else {
            endTime1 = lookLastTime(lookWorkingListSize("PM7", machineList)-1, "PM7", machineList)+50+50;
            startTime1 = endTime1-(50 + findDistance1(sourcePosition,"PM7") + 50);
            if (startTime1<startTime){
                startTime1=startTime;
                endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM7") + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM7",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime1,endTime1,"TM2",sourcePosition,"PM7",machineList,specialTime,specialPosition));
                if (!checkMachineState1(startTime1,sourcePosition,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(startTime1,sourcePosition,machineList));
                if (!checkMachine_PM(endTime1-50,"PM7",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime1-50,"PM7",cleanMachineList)+50-(50 + findDistance1(sourcePosition,"PM7") + 50));
                startTime1=startTimeMax;
                endTime1=startTime1 + 50 + findDistance1(sourcePosition,"PM7") + 50;
            }while (!(checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM7",machineList,specialTime,specialPosition)&&checkMachineState1(startTime1,sourcePosition,machineList)&&checkMachine_PM(endTime1-50,"PM7",cleanMachineList)));
            //改动部分
            TM2:for (int j = 0; j < 10000; j++) {
                b2=checkMachine_TM23(startTime1,endTime1,"TM2",sourcePosition,"PM7",machineList,specialTime,specialPosition);
                b3=checkMachineState1(startTime1,sourcePosition,machineList);
                a1=checkMachine_PM(endTime1-50,"PM7",cleanMachineList);
                if (b2&&b3&&a1) {
                    break TM2;
                }else {
                    endTime1=endTime1+1;
                    startTime1 = endTime1-(50 + findDistance1(sourcePosition,"PM7") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM78阈值过小!!!");
            }
        }
        endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM8") + 50;
        boolean b4=(endTime2-50>=lookLastTime(lookWorkingListSize("PM8",machineList)-1,"PM8",machineList)+50);
        boolean b5=checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM8",machineList,specialTime,specialPosition);
        boolean b6=checkMachineState1(startTime2,sourcePosition,machineList);
        boolean a2=checkMachine_PM(endTime2-50,"PM8",cleanMachineList);
        if (b4&&b5&&b6&&a2) {

        }else {
            endTime2 = lookLastTime(lookWorkingListSize("PM8", machineList)-1, "PM8", machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance1(sourcePosition,"PM8") + 50);
            if (startTime2<startTime){
                startTime2=startTime;
                endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM8") + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM8",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM2",sourcePosition,"PM8",machineList,specialTime,specialPosition));
                if (!checkMachineState1(startTime2,sourcePosition,machineList))
                    startTimeMax=Math.max(startTimeMax,checkMachineState1_Out(startTime2,sourcePosition,machineList));
                if (!checkMachine_PM(endTime2-50,"PM8",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,"PM8",cleanMachineList)+50-(50 + findDistance1(sourcePosition,"PM8") + 50));
                startTime2=startTimeMax;
                endTime2=startTime2 + 50 + findDistance1(sourcePosition,"PM8") + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM8",machineList,specialTime,specialPosition)&&checkMachineState1(startTime2,sourcePosition,machineList)&&checkMachine_PM(endTime2-50,"PM8",cleanMachineList)));
            //改动部分
            TM2:for (int j = 0; j < 10000; j++) {
                b5=checkMachine_TM23(startTime2,endTime2,"TM2",sourcePosition,"PM8",machineList,specialTime,specialPosition);
                b6=checkMachineState1(startTime2,sourcePosition,machineList);
                a2=checkMachine_PM(endTime2-50,"PM8",cleanMachineList);
                if (b5&&b6&&a2) {
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance1(sourcePosition,"PM8") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM78阈值过小!!!");
            }
        }
        if (endTime1<=endTime2)
            return "PM7";
        else
            return "PM8";
    }
    public static String changePM45(String sourcePosition, int startTime, List<Machine> machineList,List<Machine> cleanMachineList,int specialTime,String specialPosition){
        int startTime1=startTime;
        int startTime2=startTime;
        int endTime1;
        int endTime2;
        endTime1=startTime1 + 50 + findDistance2(sourcePosition,"PM4") + 50;
        boolean b1=(endTime1-50>=lookLastTime(lookWorkingListSize("PM4",machineList)-1,"PM4",machineList)+50);
        boolean b2=checkMachine_TM23(startTime1,endTime1,"TM3",sourcePosition,"PM4",machineList,specialTime,specialPosition);
        boolean a1=checkMachine_PM(endTime1-50,"PM4",cleanMachineList);
        if (b1&&b2&&a1) {

        }else {
            endTime1 = lookLastTime(lookWorkingListSize("PM4",machineList)-1,"PM4",machineList)+50+50;
            startTime1 = endTime1-(50 + findDistance2(sourcePosition,"PM4") + 50);
            if (startTime1<startTime){
                startTime1=startTime;
                endTime1=startTime1 + 50 + findDistance2(sourcePosition,"PM4") + 50;
            }
            //改动部分
            int startTimeMax=startTime1;
            do {
                if (!checkMachine_TM23(startTime1,endTime1,"TM3",sourcePosition,"PM4",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime1,endTime1,"TM3",sourcePosition,"PM4",machineList,specialTime,specialPosition));
                if (!checkMachine_PM(endTime1-50,"PM4",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime1-50,"PM4",cleanMachineList)+50-(50 + findDistance2(sourcePosition,"PM4") + 50));
                startTime1=startTimeMax;
                endTime1=startTime1 + 50 + findDistance2(sourcePosition,"PM4") + 50;
            }while (!(checkMachine_TM23(startTime1,endTime1,"TM3",sourcePosition,"PM4",machineList,specialTime,specialPosition)&&checkMachine_PM(endTime1-50,"PM4",cleanMachineList)));
            //改动部分
            int counter=0;
//            List<Integer> newTime=checkMachineSpecial_TM23(startTime,startTime1,endTime1,"TM3",sourcePosition,"PM4",false,false,true,machineList,cleanMachineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime1=newTime.get(newTime.size()-2);
//                endTime1=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:for (int j = 0; j < 10000; j++) {
                b2=counter==1||checkMachine_TM23(startTime1,endTime1,"TM3",sourcePosition,"PM4",machineList,specialTime,specialPosition);
                a1=checkMachine_PM(endTime1-50,"PM4",cleanMachineList);
                if (b2&&a1) {
                    break TM2;
                }else {
                    endTime1=endTime1+1;
                    startTime1 = endTime1-(50 + findDistance2(sourcePosition,"PM4") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM45阈值过小!!!");
            }
        }
        endTime2=startTime2 + 50 + findDistance2(sourcePosition,"PM5") + 50;
        boolean b3=(endTime2-50>=lookLastTime(lookWorkingListSize("PM5",machineList)-1,"PM5",machineList)+50);
        boolean b4=checkMachine_TM23(startTime2,endTime2,"TM3",sourcePosition,"PM5",machineList,specialTime,specialPosition);
        boolean a2=checkMachine_PM(endTime2-50,"PM5",cleanMachineList);
        if (b3&&b4&&a2) {

        }else {
            endTime2 = lookLastTime(lookWorkingListSize("PM5",machineList)-1,"PM5",machineList)+50+50;
            startTime2 = endTime2-(50 + findDistance2(sourcePosition,"PM5") + 50);
            if (startTime2<startTime){
                startTime2=startTime;
                endTime2=startTime2 + 50 + findDistance2(sourcePosition,"PM5") + 50;
            }
            //改动部分
            int startTimeMax=startTime2;
            do {
                if (!checkMachine_TM23(startTime2,endTime2,"TM3",sourcePosition,"PM5",machineList,specialTime,specialPosition))
                    startTimeMax=Math.max(startTimeMax,checkMachine_TM23_Out(startTime2,endTime2,"TM3",sourcePosition,"PM5",machineList,specialTime,specialPosition));
                if (!checkMachine_PM(endTime2-50,"PM5",cleanMachineList))
                    startTimeMax=Math.max(startTimeMax,checkMachine_PM_Out(endTime2-50,"PM5",cleanMachineList)+50-(50 + findDistance2(sourcePosition,"PM5") + 50));
                startTime2=startTimeMax;
                endTime2=startTime2+50 + findDistance2(sourcePosition,"PM5") + 50;
            }while (!(checkMachine_TM23(startTime2,endTime2,"TM3",sourcePosition,"PM5",machineList,specialTime,specialPosition)&&checkMachine_PM(endTime2-50,"PM5",cleanMachineList)));
            //改动部分
            int counter=0;
//            List<Integer> newTime=checkMachineSpecial_TM23(startTime,startTime2,endTime2,"TM3",sourcePosition,"PM5",false,false,true,machineList,cleanMachineList,specialTime,specialPosition);
//            if (newTime.size()!=0){
//                startTime2=newTime.get(newTime.size()-2);
//                endTime2=newTime.get(newTime.size()-1);
//                counter=1;
//            }
            TM2:for (int j = 0; j < 10000; j++) {
                b4=counter==1||checkMachine_TM23(startTime2,endTime2,"TM3",sourcePosition,"PM5",machineList,specialTime,specialPosition);
                a2=checkMachine_PM(endTime2-50,"PM5",cleanMachineList);
                if (b4&&a2) {
                    break TM2;
                }else {
                    endTime2=endTime2+1;
                    startTime2 = endTime2-(50 + findDistance2(sourcePosition,"PM5") + 50);
                }
                if (j==9999)
                    System.out.println("changeTM45阈值过小!!!");
            }
        }
        if (endTime1<=endTime2)
            return "PM4";
        else
            return "PM5";
    }
    public static boolean[] ordering_BmachineToGene(int translateMode,List<Ordering_Bmachine> orderingBmachines){
        boolean[] gene=new boolean[orderingBmachines.size()*4];
        int counter=0;
        for (Ordering_Bmachine orderingBmachine:orderingBmachines){
            if (orderingBmachine.getFinalPosition0()=="LLA")
                gene[counter]=true;
            else
                gene[counter]=false;
            counter++;
            if (orderingBmachine.getFinalPosition1()=="PM7")
                gene[counter]=true;
            else
                gene[counter]=false;
            counter++;

            if (translateMode==0){
                if (counter<100){
                    if (orderingBmachine.getFinalPosition2()=="PM4")
                        gene[counter]=true;
                    else
                        gene[counter]=false;
                }else if (counter<200){
                    if (orderingBmachine.getFinalPosition2()=="PM9")
                        gene[counter]=true;
                    else
                        gene[counter]=false;
                }else
                    gene[counter]=true;
            }else if (translateMode==1){
                if (orderingBmachine.getFinalPosition2()=="PM4")
                    gene[counter]=true;
                else
                    gene[counter]=false;
            }else if (translateMode==2){
                if (orderingBmachine.getFinalPosition2()=="PM9")
                    gene[counter]=true;
                else
                    gene[counter]=false;
            }else
                gene[counter]=true;

            counter++;
            if (orderingBmachine.getFinalPosition3()=="LLA")
                gene[counter]=true;
            else
                gene[counter]=false;
            counter++;
        }
        return gene;
    }
}

