package in.psk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AppService {
Logger log=LoggerFactory.getLogger(AppService.class);
	public String getWelcomeMessage()
	{log.trace("trace is Started...");
	log.debug("Debug is Started...");
		log.info("Log Info is Started...");
		String msg="Welcome to India";
		log.info("Log Info Is ended...");
		log.warn("Warn Is Started...");
		log.error("Error is Started...");
		return  msg;
	}
}
