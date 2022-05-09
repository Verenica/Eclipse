//создаём класс

class Dog {
//переменные экземпляра
	int size;
	String breed;
	String name;

//метод
	void bark() {
		System.out.println("Гав! Гав!");
	};
	void dance() {
		System.out.println("qqq");
	}
	void getDog (){
		//System.out.println("www" + size);
		
		if (size > 45) {
			bark();	
		}
		else if (size < 45) {
			dance();
		}
		else {
			bark();
			dance();		
		}
	}
}

//создаем проверочный класс
public class DogTestDrive {
	
//проверочный код для класса Dog
	public static void main (String[] args) {
		Dog one = new Dog(); //создаем объект класса Dog
		one.size = 40; //используем оператор доступа. Устанавливаем значение поля size.
		one.getDog(); //вызываем метод bark()
		Dog two = new Dog();
		two.size = 45;
		two.getDog();
		Dog three = new Dog();
		three.size = 50;
		three.getDog();	
	}
}