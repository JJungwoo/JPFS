package Effective;

import java.util.Date;

public final class Periodtest {
    private final Date start;
    private final Date end;

    /**
     * @param start 시작 시각
     * @param end 종료 시각; 시작 시각보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 졸료 시각보다 늦을 때 발생한다.
     * @throws NullPointerException start나 end가 null이면 발생한다.
     */
    public Periodtest(Date start, Date end) {
        System.out.println("constructer");
        System.out.println("start: "+ start + ", end: " + end);
        // solution 1
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        System.out.println("start: "+ start + ", end: " + end);
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(
                    start + "가 " + end + "보다 늦다.");
        }
        //this.start = start;
        //this.end = end;
    }

    public Date start() {
        return new Date(start.getTime());
        //return start;
    }

    public Date end() {
        return new Date(end.getTime());
        //return end;
    }

    /*
    // solution 2
    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
    */
    public static void main(String[] args) {

    }
}
