package io.fabric8.quickstarts.camel;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "cbr")
public class ConfigurationHelper {
	
	private String headerName;
	private String site1key;
	private String site1value;
	private String site2key;
	private String site2value;
	private String siteDefault;
	public String getHeaderName() {
		return headerName;
	}
	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}
	public String getSite1key() {
		return site1key;
	}
	public void setSite1key(String site1key) {
		this.site1key = site1key;
	}
	public String getSite1value() {
		return site1value;
	}
	public void setSite1value(String site1value) {
		this.site1value = site1value;
	}
	public String getSite2key() {
		return site2key;
	}
	public void setSite2key(String site2key) {
		this.site2key = site2key;
	}
	public String getSite2value() {
		return site2value;
	}
	public void setSite2value(String site2value) {
		this.site2value = site2value;
	}
	public String getSiteDefault() {
		return siteDefault;
	}
	public void setSiteDefault(String siteDefault) {
		this.siteDefault = siteDefault;
	}
	
	

}
