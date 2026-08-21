public class EmployeeSalary{
float net_salary,BS,DA,HRA,MA,TA,PF;

EmployeeSalary(float b){
  BS = b;

    DA = 60*BS/100;
	HRA = 30*BS/100;
	MA = 20*BS/100;
	TA =15*BS/100;
	PF = 10*BS/100;
	net_salary = BS+DA+HRA+MA+TA-PF;
}

void display() {
	System.out.println("|--------------------------------|");
	System.out.println("|--------- Salary Slip ----------|");
System.out.println("|--------------------------------|");
	System.out.println("|Employ_ID---|Name|---|Dept|-----|");

	System.out.print("||101|");
	System.out.print("-------|Sapna|--");
	System.out.println("|Science|--|");
	System.out.print("|B.S.|:"+BS);
	System.out.println("-------------------|");
	System.out.print("|D.A.|:"+DA);
	System.out.println("-------------------|");
	System.out.print("|M.A.|:"+MA);
	System.out.println("--------------------|");
	System.out.print("|T.A.|:"+TA);
	System.out.println("--------------------|");
	System.out.print("|H.R.A.|:"+HRA);
	System.out.println("------------------|");
	System.out.print("|P.F.|:"+PF);
	System.out.println("--------------------|");
	System.out.print("|------------Net_Salary:"+net_salary);
	System.out.println("--|");
	}

public static void main(String args[]){
EmployeeSalary e1 = new EmployeeSalary (25000);

  e1.display();

  }
}







