
public class TowerOfHaNoi {
	public static void moveTower(int disk, char source, char dest, char spare) {
		if (disk == 0)
			System.out.println("Move disk form " + source + " to " + dest);
		else {
			moveTower(disk - 1, source, spare,dest);
			System.out.println("Move disk from " + source + " to " + dest);
			moveTower(disk - 1,spare,dest , source);

		}
		
	}
	public static void main(String[] args) {
		int disk =3;
		char source = 'a';
		char dest='b';
		char spare ='c';
		moveTower(disk,source,dest,spare);
	}

}
