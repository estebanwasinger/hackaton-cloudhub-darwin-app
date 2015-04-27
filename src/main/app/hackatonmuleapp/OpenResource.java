package hackatonmuleapp;

import java.io.InputStream;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class OpenResource implements Callable {

	@Override
	public InputStream onCall(MuleEventContext eventContext) throws Exception {
		InputStream is = this.getClass().getResourceAsStream("/control.html");
		return is;
	}

}

