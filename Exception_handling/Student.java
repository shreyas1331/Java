package Exception_handling;

public class Student {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception  {
//		if(age<0) {
//			System.out.println("Age Can Not be -ve");
//		}else {
//			this.age = age;
//		}
			if (age < 0) {
				
				throw new Exception();
				
			}
//			this.age = age;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void intro() {
//		System.out.println(name+" "+age);
//	}

}