package com.example.campus.Functions;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

    /**
     * 根据字符日期返回星期几
     * @param dateTime
     * @return
     */
    public String getWeek(String dateTime){
        String week = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
             Date date= sdf.parse(dateTime);
            SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
            week = dateFm.format(date);
            week=week.replaceAll("星期","周");
        }catch (ParseException e){
            e.printStackTrace();
        }
        return week;
    }

    /**
     * 获取过去7天内的日期数组
     * @param intervals      intervals天内
     * @return              日期数组
     */
    public ArrayList<String> getDays(int intervals) {
        ArrayList<String> pastDaysList = new ArrayList<>();
        for (int i = intervals -1; i >= 0; i--) {
            pastDaysList.add(getPastDate(i));
        }
        return pastDaysList;
    }
    /**
     * 获取过去第几天的日期
     * @param past
     * @return
     */
    public String getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        Date today = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String result = format.format(today);
        return result;
    }

    public ArrayList<String> getList(ArrayList<String> list){
        String mm="";
        String newWeek="";
        ArrayList<String> list2=new ArrayList<>();
        /*for (String s: list) {
            newWeek=getWeek(s);
             mm+=newWeek+" ";
        }*/
        for(int i = 0;i < list.size(); i ++){
            newWeek=getWeek(list.get(i));
            list2.add(newWeek);
        }
        return list2;
    }

    public static void main(String[] args) {
        DateFormat df=new DateFormat();
        ArrayList<String> aa=df.getDays(7);
        System.out.println(aa);
        String bb=df.getPastDate(3);
        System.out.println(bb);
        String cc=df.getWeek(bb);
        System.out.println(cc);
        df.getList(aa);
        System.out.println(df.getList(aa));
    }
}
