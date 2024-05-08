public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0]=new Employee("Карманова","Ольга","Валерьевна",3,51200);
        employees[1]=new Employee("Аронова","Наталья","Павловна",1,32800);
        employees[2]=new Employee("Пиков","Антон","Дмитриевич",3,37200);
        employees[3]=new Employee("Омутов","Илья","Олегович",2,43600);
        employees[4]=new Employee("Туманова","Марина","Олеговна",1,21100);
        employees[5]=new Employee("Петров","Алексей","Александрович",2,72300);
        employees[6]=new Employee("Сватов","Александр","Анатольевич",3,54200);
        employees[7]=new Employee("Тунец","Оксана","Владимировна",1,41200);
        employees[8]=new Employee("Капустин","Роман","Иванович",3,47300);
        employees[9]=new Employee("Малых","Вадим","Петрович",2,49100);
        for (int a=0;a <= employees.length-1;a++){
            System.out.println(employees[a]);
        }



    }
}