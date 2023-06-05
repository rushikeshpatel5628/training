package overriding_method;

public class RBI {
	float getRateOfInterest() {
		return 6.9f;
	}
}
class SBI extends RBI{
	@Override
	float getRateOfInterest(){return 8f;}  
} 
class ICICI extends RBI{
	@Override
	float getRateOfInterest(){return 7f;}  
}  
class AXIS extends RBI{  
	@Override
	float getRateOfInterest(){return 9f;}  
}  
