package org.myjava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Developer on 3/18/2017.
 */
public class BoundGenerics {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<? extends Pet> pets = cats;

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        callPets(pets);

        List<Animal> animals = new ArrayList<>();
    }
               //Коллекция потребляет данные\Consumer\Операция записи - можем сложить Т и все классы предки приведенные к обжект
        static void fillPets(List<? super Pet> pets){
            pets.add(new Dog());
            pets.add(new Cat());
        }
    //Коллекция потребляет данные\СConsumer\Операция записи
/*   void do(List<? super Pet> src){
        for (Object item : src){
           ...
        }
     }*/
                //КОЛЛЕКЦИЯ ПОСТАВЛЯЕТ ДАННЫЕ\PRODUCER\ОПЕРАЦИЯ ЧТЕНИЯ - читать и знаем какими классами он ограничен, можем исполнить все методы класса Пэт и наследниками приведенными к Т
        static <T extends Pet> void callPets(List<T> pets){
            for (T item : pets){
                item.call();
            }
           // pets.stream().forEach(Pet::call);
        }
//КОЛЛЕКЦИЯ ПОСТАВЛЯЕТ ДАННЫЕ\PRODUCER\ОПЕРАЦИЯ ЧТЕНИЯ
/*   void do(List<? extends Pet> src){
        for (Object item : src){
          ...
        }
     }*/

/*
          static void callPets(List<? extends Pet> list){
              for (Pet pet : list){
                  pet.call();
              }
          }
*/

 /*  Incorrect -     static void callPets(List<Pet> list){
        for (Pet pet : list){
            pet.call();
        }
    }*/

}

// for example
/*

PECS

Producer Extends Consumer Super

Producer
Поставщик может работать с типом Т и его наследниками(приведенным к Т)

Consumer
Потребитель может принимать тип Т и его предков (приведенными к Object)

*/
