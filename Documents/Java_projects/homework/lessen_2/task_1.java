/**
 * Задача 1. Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого 
 * запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки. 
 * Если значение null, то параметр не должен попадать в запрос.Пример данной строки {"name":"Ivanov", 
 * "country":"Russia", "city":"Moscow", "age":"null"} 
 * Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 */

public class task_1 {
    public static void main(String[] args) {
        String reg = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"20\"";
        StringBuilder sb = new StringBuilder(reg);
        System.out.println("\n");
        System.out.println(sb.toString());
        String reg1=reg.substring(1,reg.length()-1);
        //System.out.println(reg1);
        StringBuilder result = new StringBuilder("select * from students where ");
        System.out.println("\n");
        System.out.print(result);
        String[] keyWithVal = reg1.split(", ");
        // System.out.println(Arrays.toString(keyWithVal));
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        for (String item : keyWithVal) {
            String[] keyValue = item.split(":");
            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"","");
            // System.out.printf("промежуточные : %s %s ", key, value);

            if (!value.equalsIgnoreCase("null")) { // Если значение не равно null
               // System.out.println("значение не равно 0");
            if(flag==false){
                res.append(" AND ");
            }   
            res.append(key).append("=").append(value);     
            // System.out.printf("добавляем = %s", key);           
            flag = false;
            }
        }
    System.out.println(res);
    System.out.println("\n");
    }
}
