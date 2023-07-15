class Student {
	int sno;
	String sname;
	String course;
	double fee;
	Address address;
	public String toString(){
		return "sno\t: "+sno+"\n"+
			"Sname\t: "+sname+"\n"+
			"Course\t: "+course+"\n"+
			"Fee\t: "+fee+"\n"+
			"Address\t: "+address+"\n";
	}
}
