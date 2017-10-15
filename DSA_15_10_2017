/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DinukaMedis
 */
public class DSA_New {
    
    private static Scanner input=new Scanner(System.in);
    private static HashMap<Integer,String[]> jobsTable = new HashMap<>();
    private static HashMap<String,Integer> selectedCombinations = new HashMap<>();
    private static ArrayList<String> tempSelectedCombinations1 = new ArrayList<>();
    private static ArrayList<String> tempSelectedCombinations2 = new ArrayList<>();
    private static int count=0;
    private static String line=null;
    private static int i=0;
    private static int mValue=0;
    private static int tValue=0;
    private static HashMap<Integer,Integer> jobCountTable=new HashMap<>();
    private static ArrayList<String> tempList=new ArrayList<>();
    private static int comSize=1;
    
    private static void readData(){
        System.out.print("Input number of employees : ");
        count=input.nextInt();
        System.out.println("Input job details and enter * at the end ");
        while (!(line = input.nextLine()).equals("*")){
            String[] val = line.split(",");
            jobsTable.put(i, val);
            System.out.println("i "+i);
            i++; 
        }
        System.out.print("Input M value : ");
        mValue=input.nextInt();
        for (int j = 1; j <=count; j++) {
            tempSelectedCombinations1.add(Integer.toString(j));
        }
        System.out.println("M value check : "+tempSelectedCombinations1);
        System.out.println("count"+count);
        getJobCount(jobsTable, count,mValue);
        checkMvalue(mValue);
        makeCombinations2();
        
    }
    
    private static void getJobCount(HashMap<Integer,String[]> table,int count,int m){
        HashMap<Integer,String[]> jobs=table;
        for (int i = 1; i <jobs.size(); i++) {
            String [] array=jobs.get(i);
            for (String string : array){
                int num=Integer.parseInt(string);
                int n=0;
                if(jobCountTable.get(num)!=null){
                    n=jobCountTable.get(num);
                }
                jobCountTable.put(num, (n+1)); 
            }
        }
        for (Map.Entry<Integer, Integer> entry : jobCountTable.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key "+key+"  count "+value);
            if (value>=m){
                
            }
        }
        
    }
    
    private static void checkMvalue(int m){
        for (Map.Entry<Integer, Integer> entry : jobCountTable.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value<m){
                updateTable(jobsTable, Integer.toString(key));
                tempSelectedCombinations1.remove(Integer.toString(key));
            }
        }
        System.out.println("M value check : "+tempSelectedCombinations1);
    }
    
    private static void updateTable(HashMap<Integer,String[]> table,String employee){
        HashMap<Integer,String[]> tempTable=table;
        for (Map.Entry<Integer, String[]> entry : tempTable.entrySet()) {
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            for (String string : value) {
                if (employee.equals(string)) {
                    int index=Arrays.asList(value).indexOf(string);
                    for (int j = index; j < value.length-1; j++) {
                        value[j]=value[j+1];
                    }
                    value[value.length-1]="";
                    jobsTable.put(key, value);
                }
            }
        }
        System.out.println("**************************************");
        for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+"---->"+Arrays.toString(value));
            //makeCombinations(value);
        }
    }
    
//    private static void makeCombinations(){
//        for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
//            Integer key = entry.getKey();
//            String[] value = entry.getValue();
//            System.out.println(key+"==="+Arrays.toString(value));
//            combinationCreator(value);
//        }
//        for (String string : tempList) {
//            System.out.println(string);
//            selectedCombinations.put(string, 0);
//        }
//        comSize++;
//        checkMainTable();
//    }
    
    private static void makeCombinations(){
        for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+"==="+Arrays.toString(value));
            String [] g=getAllCombinations(value, 2);
            System.out.println("New array :"+Arrays.toString(g));
        }
    }
    
    private static void makeCombinations2(){
        tempSelectedCombinations1.addAll(tempSelectedCombinations2);
        tempSelectedCombinations1.addAll(tempSelectedCombinations1);
        String [] elements=tempSelectedCombinations1.toArray(new String[tempSelectedCombinations1.size()]);
        getAllCombinations1(elements, 2);
        getAllCombinations1(elements, 2);
        getAllCombinations1(elements, 2);
    }
    
    private static void checkMainTable(){
        for (Map.Entry<String, Integer> entry : selectedCombinations.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            String[] array = key.split(":");
            int newVal=mainTableChecker(array);
            selectedCombinations.put(key, newVal);
        }
//        mainTableChecker(array);//int value return
        for (Map.Entry<String, Integer> entry : selectedCombinations.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key"+key+"=>>"+value);
        }
        //calculations();
    }
    
    private static void calculations(){
        for (Map.Entry<String, Integer> entry : selectedCombinations.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            String[] array = key.split(":");
            System.out.println("Array length : "+array.length+"comSize : "+comSize);
            if (array.length==comSize) {
                if (value<mValue) {
                    System.out.println("88888888888888888888888888888888888");
                }
            }
            //combinations check keranna ....
//            for (Map.Entry<String, Integer> entry1 : selectedCombinations.entrySet()) {
//                String key1 = entry1s.getKey();
//                int value1 = entry1.getValue();
//                System.out.println("key"+key1+"=>>"+value1);
//            }
        }
    }

    public static void main(String[] args) {
        readData();
        //updateTable(jobsTable,"4");
    }
    
    private static void combinationCreator(String [] array){
        String [] list=array;
        String letter=null;
        for (int j = 1; j < list.length; j++) {
            letter=list[list.length-(j)];
            for (int k = 0; k < list.length-j; k++) {
                if(!tempList.contains(letter+list[k])){
                    tempList.add(letter+":"+list[k]);
                }  
            }
        }
//        for (String string : tempList) {
//            System.out.println(string);
//        }
    }
    
    private static int mainTableChecker(String [] array){
        // check main table to get count
        int val=0;
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
        for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
            int nums=0;
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            for (String string : value) {
//                System.out.println("value : "+arrayList);
//                System.out.println("String : "+string+"------>"+(arrayList.contains("1")));
                if (arrayList.contains(string)) {
                    nums++;
                }
            }
            if (nums==arrayList.size()) {
                val++;
            }
        }
        
        return val;
    }
    
    public static String[] getAllCombinations(String[] elements, int lengthOfList){
        String[] allLists = new String[(int)Math.pow(elements.length, lengthOfList)];
        ArrayList<String> list=new ArrayList<>();
        if(lengthOfList == 1) return elements; 
        else {
            String[] allSublists = getAllCombinations(elements, lengthOfList - 1);
            int arrayIndex = 0;
            for(int i = 0; i < elements.length; i++){
                for(int j = 0; j < allSublists.length; j++){
                    allLists[arrayIndex] = elements[i] + allSublists[j];
                    arrayIndex++;
                }
            }
            for (String allSublist : allLists) {
                System.out.println(allSublist);
                if (!list.contains(allSublists) ) {
                    list.add(allSublist);
                }
            }
            ArrayList<String> newList=new ArrayList<>(new LinkedHashSet<String>(list));
            System.out.println("Array at Com :"+newList);
            String [] newArray=newList.toArray(new String[newList.size()]);
            for (String string : newArray) {
                tempSelectedCombinations2.add(string);
            }
            return newArray;
        }
    }
    
    private static String[] getAllCombinations1(String[] elements, int lengthOfList){
        String ele="";
        String letter="";
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        if (tempSelectedCombinations2.size()==0) {
            for (int j = 0; j < tempSelectedCombinations1.size()-1; j++) {
                letter=tempSelectedCombinations1.get(tempSelectedCombinations1.size()-j-1);
                for (int k = 0; k < tempSelectedCombinations1.size()-j; k++) {
                    String one=tempSelectedCombinations1.get(j)+tempSelectedCombinations1.get(k);
                    String two=tempSelectedCombinations1.get(k)+tempSelectedCombinations1.get(j);
                    if (!list.contains(one)&& !(tempSelectedCombinations1.get(j).equals(tempSelectedCombinations1.get(k)))) {
                        ele=two;
                        list.add(ele);
                    }
                    
                }
            }
        }else{
            for (int j = 0; j < tempSelectedCombinations1.size(); j++) {
                for (int k = 0; k < tempSelectedCombinations2.size(); k++) {
                    String [] l1=tempSelectedCombinations2.get(k).split("");
                    //Collections.addAll(temp, l1);
                    temp=new ArrayList( Arrays.asList( l1));
                    System.out.println(tempSelectedCombinations1.get(j)+" is contains : "+temp+"========>"+!temp.contains(tempSelectedCombinations1.get(j)));
                    if (!temp.contains(tempSelectedCombinations1.get(j))) {
                        ele=tempSelectedCombinations1.get(j)+tempSelectedCombinations2.get(k);
                        list.add(ele);
                    }
                    
                }
            }
        }
        ArrayList<String> newList=new ArrayList<>(new LinkedHashSet<String>(list));
        System.out.println("Array at Com :"+newList);
        String [] newArray=newList.toArray(new String[newList.size()]);
        tempSelectedCombinations2=new ArrayList<>();
        for (String string : newArray) {
            tempSelectedCombinations2.add(string);
        }
        System.out.println("temp 2 Array :"+tempSelectedCombinations2);
        return newArray;
    }
}

/*
4
1,2,3,4
1,3,4
2,3,4
1,4
3,4
*
*/

////////////////////////////////////////////////////////Update///////////////////////

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DinukaMedis
 */
public class AssignmentC {
    private static Scanner input=new Scanner(System.in);
    private static HashMap<Integer,String[]> jobsTable = new HashMap<>();
    private static HashMap<String,Integer> selectedCombinations = new HashMap<>();
    private static ArrayList<String> tempSelectedCombinations1 = new ArrayList<>();
    private static ArrayList<String> tempSelectedCombinations2 = new ArrayList<>();
    private static ArrayList<String> greaterMlist = new ArrayList<>();
    private static ArrayList<String> ptsList = new ArrayList<>();
    private static int count=0;
    private static String line=null;
    private static int i=0;
    private static int mValue=0;
    private static int tValue=0;
    private static HashMap<Integer,Integer> jobCountTable=new HashMap<>();
    private static ArrayList<String> tempList=new ArrayList<>();
    private static int comSize=1;
    private static boolean stop=false;
    
    //Read Data
    
    private static void readData(){
        System.out.print("Input number of employees : ");
        count=input.nextInt();
        System.out.println("Input job details and enter * at the end ");
        while (!(line = input.nextLine()).equals("*")){
            String[] val = line.split(",");
            jobsTable.put(i, val);
            System.out.println("i "+i);
            i++; 
        }
        System.out.print("Input M value : ");
        mValue=input.nextInt();
        for (int j = 1; j <=count; j++) {
            tempSelectedCombinations1.add(Integer.toString(j));
        }
        System.out.println("M value check : "+tempSelectedCombinations1);
        System.out.println("count"+count);
        getJobCount(jobsTable, count,mValue);
        checkMvalue(mValue);
        makeCombinations2();
        
    }
    
    private static void getJobCount(HashMap<Integer,String[]> table,int count,int m){
        HashMap<Integer,String[]> jobs=table;
        for (int i = 1; i <jobs.size(); i++) {
            String [] array=jobs.get(i);
            for (String string : array){
                int num=Integer.parseInt(string);
                int n=0;
                if(jobCountTable.get(num)!=null){
                    n=jobCountTable.get(num);
                }
                jobCountTable.put(num, (n+1)); 
            }
        }
        for (Map.Entry<Integer, Integer> entry : jobCountTable.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key "+key+"  count "+value);
            if (value>=m){
                
            }
        }
        
    }
    
    private static void checkMvalue(int m){
        for (Map.Entry<Integer, Integer> entry : jobCountTable.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value<m){
                updateTable(jobsTable, Integer.toString(key));
                tempSelectedCombinations1.remove(Integer.toString(key));
            }
        }
        System.out.println("M value check : "+tempSelectedCombinations1);
    }
    
    private static void updateTable(HashMap<Integer,String[]> table,String employee){
        HashMap<Integer,String[]> tempTable=table;
        for (Map.Entry<Integer, String[]> entry : tempTable.entrySet()) {
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            for (String string : value) {
                if (employee.equals(string)) {
                    int index=Arrays.asList(value).indexOf(string);
                    for (int j = index; j < value.length-1; j++) {
                        value[j]=value[j+1];
                    }
                    value[value.length-1]="";
                    jobsTable.put(key, value);
                }
            }
        }
        System.out.println("**************************************");
        for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
            Integer key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key+"---->"+Arrays.toString(value));
            //makeCombinations(value);
        }
    }
    
    private static void makeCombinations2(){
//        tempSelectedCombinations1.addAll(tempSelectedCombinations2);
//        tempSelectedCombinations1.addAll(tempSelectedCombinations1);
//        String [] elements=tempSelectedCombinations1.toArray(new String[tempSelectedCombinations1.size()]);
        while(!stop) {
            getAllCombinations1();
            checkMainTable1();
        }
    }
    
    private static String[] getAllCombinations1(){
        String ele="";
        String letter="";
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        ArrayList<String> temp2=new ArrayList<>();
        if (tempSelectedCombinations2.isEmpty()) {
            for (int j = 0; j < tempSelectedCombinations1.size()-1; j++) {
                letter=tempSelectedCombinations1.get(tempSelectedCombinations1.size()-(j+1));
                for (int k = 0; k < tempSelectedCombinations1.size(); k++) {
                    String one=tempSelectedCombinations1.get(j)+tempSelectedCombinations1.get(k);
                    String two=tempSelectedCombinations1.get(k)+tempSelectedCombinations1.get(j);
                    if (!list.contains(one)&& !(tempSelectedCombinations1.get(j).equals(tempSelectedCombinations1.get(k)))) {
                        ele=two;
                        String [] a=ele.split("");
                        Arrays.sort(a);
                        String tm="";
                        for (String string : a) {
                            tm+=string;
                        }
                        list.add(tm);
                    }
                    
                }
            }
        }else{
            for (int j = 0; j < tempSelectedCombinations1.size(); j++) {
                for (int k = 0; k < tempSelectedCombinations2.size(); k++) {
                    String [] l1=tempSelectedCombinations2.get(k).split("");
                    String [] l2=tempSelectedCombinations1.get(j).split("");
                    Arrays.sort(l1);
                    Arrays.sort(l2);
                    //Collections.addAll(temp, l1);
                    temp=new ArrayList( Arrays.asList( l1));
                    temp2=new ArrayList( Arrays.asList( l2));
                    //System.out.println(temp2+" is contains : "+temp+"========>"+temp.containsAll(temp2));
                    if (!temp.containsAll(temp2)) {
                        ele=tempSelectedCombinations1.get(j)+tempSelectedCombinations2.get(k);
                        String [] a=ele.split("");
                        Arrays.sort(a);
                        String tm="";
                        for (String string : a) {
                            tm+=string;
                        }
                        list.add(tm);
                    }
                    
                }
            }
        }
        ArrayList<String> newList=new ArrayList<>(new LinkedHashSet<String>(list));
        System.out.println("Array at Com :"+newList);
        if (newList.size()==0) {
            stop=true;
        }
        String [] newArray=newList.toArray(new String[newList.size()]);
        tempSelectedCombinations2=new ArrayList<>();
        for (String string : newArray) {
            tempSelectedCombinations2.add(string);
        }
        System.out.println("temp 2 Array :"+tempSelectedCombinations2);
        return newArray;
    }
    
    private static void checkMainTable1(){
        int count=0;
        ArrayList<String> tempList1=new ArrayList<>();
        ArrayList<String> tempList2=new ArrayList<>();
        for (String string : tempSelectedCombinations2) {
            tempList1=new ArrayList<>(Arrays.asList(string.split("")));
            for (Map.Entry<Integer, String[]> entry : jobsTable.entrySet()) {
                Integer key = entry.getKey();
                String[] value = entry.getValue();
                tempList2=new ArrayList<>(Arrays.asList(value));
                //System.out.println(tempList1+" is contain "+tempList2+" = "+(tempList2.containsAll(tempList1)||tempList1.containsAll(tempList2)));
                if (tempList2.containsAll(tempList1)) {
                    count++;
                }
            }
            if (count>=mValue) {
                selectedCombinations.put(string, count);
                greaterMlist.add(string);
            }
            count=0;
        }
                
        for (Map.Entry<String,Integer> entry : selectedCombinations.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key :"+key+" value :"+value);
            
        }
    }
    
    private static void calculatePTS(){
        Collections.reverse(greaterMlist);
        ArrayList<String> tempList1=new ArrayList<>();
        ArrayList<String> tempList2=new ArrayList<>();
        tempList1=new ArrayList<>(Arrays.asList(greaterMlist.get(0).split("")));
        int size=tempList1.size();
        ptsList.add(greaterMlist.get(0));
        for (int j = 1; j <greaterMlist.size(); j++) {
            tempList2=new ArrayList<>(Arrays.asList(greaterMlist.get(j).split("")));
            if (tempList2.size()<size) {
                
            }
        }
        
        System.out.println("new G : "+greaterMlist);
    }
    
    public static void main(String[] args) {
        readData();
        System.out.println("Greater M :"+greaterMlist);
        calculatePTS();
        System.out.println("Comb 1"+tempSelectedCombinations1);
        System.out.println("Comb 2"+tempSelectedCombinations2);
    }
    
   
}


/*
4
1,2,3,4
1,3,4
2,3,4
1,4
3,4
*

========================

7
1,2,3,4,5,6,7
1,3,5,7
2,4,5,6
1,5
5,6,7
2,4,7
2,3,4,5,6,7
*
*/
