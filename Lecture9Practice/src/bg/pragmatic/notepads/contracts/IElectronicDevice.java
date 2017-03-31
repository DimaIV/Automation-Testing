package bg.pragmatic.notepads.contracts;

public interface IElectronicDevice extends INotepad{

	void start();
	void stop();
	boolean isStarted();
}
