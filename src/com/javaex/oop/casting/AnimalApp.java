package com.javaex.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {
		Animal dog1 = new Dog("다온이");
		// 업캐스팅: 부모 타입으로 자손 객채를 참조하는 것
			// 자동 캐스팅
		// 참조 타입에 설계된 것만 사용 가능
		
		dog1.eat();
		dog1.walk();
//		dog1.wang(); // 설계도에 있는 것만 사용 가능
		
		Dog dog2 = new Dog("겨울이");
		dog2.eat();
		dog2.walk();
		dog2.wang();
		
		// 다운캐스팅: 명시적으로 타입을 지정
		// dog1.wang() 을 가능하도록
		((Dog)(dog1)).wang();
		{ Dog pet = new Dog("미유");
			pet.eat();
			pet.walk();
			pet.wang();
			// 현재 pet이 어떤 클래스의 인스턴스인지 확인
			
			pet=null;
			
//			pet = new Cat("몽실"); // 부모가 아닌 다른 클래스에는 참조 불가
		}
		
		
		{ Animal pet = new Dog("미유");
			pet.eat();
			pet.walk();
			pet=null;
			
			if(pet instanceof Dog) {	// Dog의 인스턴스명
				((Dog)pet).wang();
			} else if(pet instanceof Cat) {
				((Cat)pet).meow();
			}
			
			pet = new Cat("몽실");
			pet.eat();
			pet.walk();
			((Cat)(pet)).meow();
		}
	}
}