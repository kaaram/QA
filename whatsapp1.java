import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class whatsapp1 {

	@Test
	public void test() throws MalformedURLException {
		File dir=new File("src");
		File app=new File(dir,"com.whatsapp_v2.16.272-451398_Android-2.3.4.apk");
		DesiredCapabilities des=new DesiredCapabilities();
		des.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		des.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator");
		des.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),des);
	}

}
