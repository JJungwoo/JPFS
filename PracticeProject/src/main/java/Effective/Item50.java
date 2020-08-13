package Effective;

import java.util.Date;

class Period {
    private final Date start;
    private final Date end;

    /**
     * @param start 시작 시각
     * @param end 종료 시각; 시작 시각보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 졸료 시각보다 늦을 때 발생한다.
     * @throws NullPointerException start나 end가 null이면 발생한다.
     */
    public Period(Date start, Date end) {
        // solution 1. detensive copy
        // 시간 값을 새로 만들어서 불변하게 복사
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(
                    start + "가 " + end + "보다 늦다.");
        }
        //this.start = start;
        //this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    /*
    // solution 2
    public Date start() {
        System.out.println("Start()!!!");
        return new Date(start.getTime());
    }

    public Date end() {
        System.out.println("End()!!!");
        return new Date(end.getTime());
    }
    */

}

class Item50 {

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        System.out.println("start: "+ start + ", end: " + end);
        Period p = new Period(start, end);
        end.setYear(78);
        System.out.println("pstart: "+ p.start() + ", pend: " + p.end());
        p.end().setYear(77);
        System.out.println("pstart: "+ p.start() + ", pend: " + p.end());

    }
}