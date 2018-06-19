package mypkg;

public abstract class CStudent implements Myinterface{
	  public static int totalSeats=5;
	  public static double cutoff;
	  public static int bonus;
	  String sName;
	  int nAdno;
	  double mathsMark1;
	  double physicsMark1;
	  double chemistryMark1;
	  double entMark1;
	  public CStudent()
	  {
	    sName=" ";
	    nAdno=0;
	    mathsMark1=0;
	    physicsMark1=0;
	    chemistryMark1=0;
	    entMark1=0;
	   }
	  public CStudent(String sName1,int nAdno1,double mathsMark,double physicsMark,double chemistryMark,double entMark)
	  {
	    sName=sName1;
	    nAdno=nAdno1;
	    mathsMark1=mathsMark;
	    physicsMark1=physicsMark;
	    chemistryMark1=chemistryMark;
	    entMark1=entMark;
	  }
	 public abstract double calCutoff(int bonus);
	 public abstract void Display();

}
