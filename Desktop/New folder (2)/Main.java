class Calculator {
private double result;

	Calculator ( ) { this.result = 0.0; }
	Calculator(double result){ this.result = result; }

	int add (int a, int b){ this. result = a+b;  return a+b; }
	double add(double a, double b){ this.result = a+b; return a+b; }
	int add(int a, int b, int c){this.result = a+b+c; return a+b+c; } 

	int multiply( int a, int b){ this.result = a*b ; return a*b; }
	double multiply(double a , double b){ this.result = a*b; return a*b; }

	double getResult(){return result; }
	void reset(){ this.result = 0.0; }

	boolean compare(Calculator other){ 
	if(this.result > other) return true; }  

	Calculator addResult(Calculator other){
	Calculator calc = new Calculator();
	calc.result += other; 
	return Calc; }
	Calculator createCopy(){Calculator calcNew = calc;  return calcNew; }

	boolean isEqual(Calculator other){ 
	if(result equals(this)) return true;  }

	

	
	

	

	
}
