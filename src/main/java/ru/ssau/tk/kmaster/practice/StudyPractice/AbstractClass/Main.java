package ru.ssau.tk.kmaster.practice.StudyPractice.AbstractClass;

public class Main {
    public static void main(String[] args) {
        /*

		�м�:
 
		animal�̶�� �θ��߻�Ŭ������ �����ϰ� �ڽ� Ŭ������ cat Ŭ������ dog Ŭ������ extends�� �޾�
		animal�� makeSound method �� override �޾� �ڽ�Ŭ�������� �����Ǹ� ��
		
		���� & �߰� ���� : 
		
		Original �ҽ����� �ڽ�Ŭ�������� extends �� �޾����� override annotation ������
		�Ǿ����� �ʾƼ� override annotation �� ���������.
		
		Animal �̶�� �߻�Ŭ������ �ִ� letsGo method �� �ڽ�Ŭ������ ���� ������ ���� �ʾƵ�
		��� �� �� ������, �ڽ� Ŭ������ ����� method(ex: catOnly) �� �θ�Ŭ������ ������� ���Ѵ�.
		
		�ڽ��� ������ Ư���� ���� Cat Ŭ������ ��ü�� �ٽ� ���� �����ֱ� ����
		�ٿ�ĳ������ ���־���.

         */
    	Animal cat = new Cat();
        Animal dog = new Dog();
            
        Cat cat2 = new Cat();
        
        cat.makeSound();
        dog.makeSound();
        
        cat2.letsGo();
        
        //cat.catOnly();/
        cat2.catOnly();
        
        Cat catDown= (Cat)cat;
        
        catDown.catWorld();
        catDown.letsGo();
       
    }
}
