package strings;

public class StringsIntro {
	public static void main(String[] args) {
		String name = "Virat Salman";
		String name2 = new String("Nikhil");
		String parts = "Chest,Shoulder,Back,Bicep,Tricep,Abs,Legs";
		String bodyParts[] = parts.split(",");

		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.substring(0, 12));
		System.out.println(name.contains("V"));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Nikhil"));
		System.out.println(name.replace('V', 'F'));
		System.out.println(name.indexOf("a"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());

		for (String part : bodyParts) {
			System.out.println(part);
		}

	}
}
