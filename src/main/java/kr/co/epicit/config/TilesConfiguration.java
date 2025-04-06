package kr.co.epicit.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfiguration {  // implements ServletContextInitializer  {
	
	@Bean
	TilesConfigurer tilesConfigurer(ServletContext servletContext) {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[]{ "/WEB-INF/views/_tiles/tiles.xml" });
		tilesConfigurer.setCheckRefresh(true);
		
		// tilesConfigurer.setUseLocaleResolution(false);  // 다국어 비활성화 - 기본값만 사용
		
//		ApplicationContext applicationContext = new ServletApplicationContext(servletContext);
//		tilesConfigurer.setTilesContainerFactoryClass(CompleteAutoloadTilesContainerFactory.class);

		return tilesConfigurer;
	}

	@Bean
	ViewResolver tilesViewResolver() {
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		
		tilesViewResolver.setViewClass(TilesView.class);
		tilesViewResolver.setOrder(0);
		
		return tilesViewResolver;
	}

//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		TilesInitializer initializer = (TilesInitializer) new CompleteAutoloadTilesContainerFactory();
//		initializer.initialize(new ServletApplicationContext(servletContext));
//		//servletContext.setAttribute(TilesServlet.TILES_CONTAINER_ATTRIBUTE, initializer);
//	}
	
}
