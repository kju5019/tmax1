package ch;

class Car {}
class FireEngine extends Car implements Movable {}
class Ambulance extends Car {}
FireEngine fe = new FireEngine();

interface Movable{}

