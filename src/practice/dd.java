package practice;
 
class Marine extends Unit{

void move(int x, int y) {}
void stimPack() {}
}

class Tank extends Unit{

void move(int x, int y) {}
void changeMode() {}
}

class Dropship extends Unit{ 

void move(int x, int y) { }
void load() {}
void unload() {}
}



class Unit{
	int x, y; 
	
	void stop() {}	
}