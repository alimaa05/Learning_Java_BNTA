package com.alimaa.LessonNotes;

public class StaticClassNotes {
    // STATIC -->
    // if you put static on method,class, field etc. belongs to the class itself and not the object
    // static belongs to the class and not the instance

    // --> in order to access anything that is static = you don't need an instance because it belongs to a class itself

//    JVM needs the main method to be static, bec the first time it runs and loads program to memory,
//    there isn't an instance for object type main - bec hasn't been created but bec the class it static,
//    JVM can take that without there needed to be an instance

    // to start with have non-static code
    // don't use static when creating the method and then when calling on it need to call to the object

    // CLASSES --> three types
    // 1) POJO - plain old java object (POJO) - basic classes where we set properties and constructors -- blueprints to you objects, they just models your object - e.g. object -->  bed, car, computer monitor
    // 2) classes that represent business logic (SERVICE) - all the steps/criteria we need to take/ conditions need to check while your building your code (add service at the end means that it's used for business logic)
    // 3) classes that interact with any database (DAO - DATA ACCESS OBJECT)
}
