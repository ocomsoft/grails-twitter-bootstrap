modules = {
	'bootstrap' {
		resource url:[dir:'css',file:'bootstrap-1.1.0.min.css', plugin:'twitter-bootstrap']
		resource url:[dir:'css',file:'bootstrap-bridge-1.1.0.css', plugin:'twitter-bootstrap']		
	}
	
	'tipsy' {
		dependsOn 'jquery'
		resource url:[dir:'js',file:'jquery.tipsy.js', plugin:'twitter-bootstrap']
	}
}