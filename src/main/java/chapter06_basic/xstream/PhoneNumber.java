package chapter06_basic.xstream;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-7-24
 * Time: 下午4:05
 * To change this template use File | Settings | File Templates
 */
public class PhoneNumber {
    private int code;
    private String number;

    public PhoneNumber(int code, String number) {
        this.code = code;
        this.number = number;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "code=" + code +
                ", number='" + number + '\'' +
                '}';
    }
}