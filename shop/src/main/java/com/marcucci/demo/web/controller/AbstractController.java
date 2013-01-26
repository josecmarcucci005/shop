package com.marcucci.demo.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;


@Controller
public abstract class AbstractController {

	protected final Log LOGGER = LogFactory.getLog(this.getClass());
			
}
