package com.example.kiosk;


public class MenuItem {
//필드 영역
    //햄버거 각각 이름 가격 설명
    private String name;
    private double price;
    private String desc;
//생성자 영역
    public MenuItem (String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }
//메서드 영역
    //Getter 메서드
    //아래 toString 메서드로 인해 Getter 메서드는 쓰임새가 당장 없다.
    public String getName () {
        return name;
    }
    public double getPrice () {
        return price;
    }
    public String getDesc () {
        return desc;
    }
    //toString 메서드로 주소값을 문자열로 바꿔서 보여주게한다.
    //override로 재정의
    @Override
    public String toString() {
        return name + " | W " + price + " | " + desc;
    }
}





