package kr.co.epicit.app.article.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value={ "/list" })
	public String list(Model model, @RequestParam Map<String, Object> mArticle) {
		logger.debug("request > /article/list");
		
		return "/article/list";
	}

	@GetMapping(value="/form.{article}")
	public String form(Model model, @PathVariable String article) {
		
		
		return "/article/form";
	}
	
	@GetMapping(value="/detail")
	public String detail(Model model, @RequestParam Map<String, Object> mArticle) {
		logger.debug("request > /detail");
		
		return "/article/detail";
	}

	@GetMapping(value="/popup/show")
	public String popupshow(Model model, @RequestParam Map<String, Object> mArticle) {
		logger.debug("request > /article/detail/popup/show");
		
		return "/article/popup/show";
	}
}
