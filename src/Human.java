public class Human {
    String name;
    int birthday;
    String cityOfResidence;
    String post;
    String noInfo = " информация не указана ";

    //Создание конструктора:

    //Human(String name , int birthday, String cityOfResidence ,String post){

    //if(name == null || name.isEmpty()) this.name = noInfo;}
    // else {this.name = name;}

    // if(birthday >=0){
    //this.birthday = birthday ;
    //}else{
    //this.birthday = Math.abc(birthday);}

     //if(cityOfResidence == null || cityOfResidence.isEmpty()) this.cityOfResidence = noInfo;
     // }else {this.cityOfResidence = cityOfResidence;}

    //if(post == null) this.post = noInfo; }
    // else { this.post = post;

    //if(cityOfResidence == null || cityOfResidence.isEmpty()) this.cityOfResidence = noInfo;
    // }else {this.cityOfResidence = cityOfResidence;}

    void toSay(){
        System.out.println("Привет.Меня зовут " + name + ".Мне " + birthday + " лет.Я живу в городе "+ cityOfResidence+ ".Я работаю на должности " + post+ ". Будем знакомы!");
    }
}


