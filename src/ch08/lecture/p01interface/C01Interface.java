package ch08.lecture.p01interface;

public class C01Interface {
}

interface Aquatic{

}
interface  Beast1{

}

class Animal1{

}
class Fish extends Animal1{

}

class Shark1 extends  Fish implements Aquatic,Beast1{

}

class Nimo1 extends  Fish {}

class Mammal extends  Animal1{}

class Tiger1 extends  Mammal{}

class Whale extends Mammal implements  Aquatic{}



