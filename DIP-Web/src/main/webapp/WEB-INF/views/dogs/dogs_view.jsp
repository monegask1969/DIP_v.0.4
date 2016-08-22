<%-- 
    Document   : dogs_view
    Created on : 31.07.2016, 20:30:33
    Author     : moneg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<link rel="icon" type="image/x-icon" href="favicon.ico" />
<link rel="shortcut icon"  href="favicon.ico" type="image/x-icon"  />
<title>Dogs In Pocket</title>
<meta name="keywords" content=""/>
<meta name="description" content="" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Droid+Serif:400italic|Oswald' rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="layout/style.css" type="text/css"/>
<link rel="stylesheet" href="layout/themes/theme_style.css" type="text/css"/>
<link rel="stylesheet" href="layout/plugins_styles/prettyPhoto.css" type="text/css"/>
<!-- Necessary for Popups -->
<link rel="stylesheet" href="layout/plugins_styles/slider.css" type="text/css"/>
<!-- Necessary for Brilliant slider -->

<script type="text/javascript" src="layout/js/jquery.js"></script>
<script type="text/javascript" src="layout/js/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="layout/js/slider.js"></script><!-- Necessary for brilliant slider -->
<script type="text/javascript" src="layout/js/jquery.carouFredSel-5.1.0-packed.js"></script><!-- Necessary for project carousel -->
<script type="text/javascript" src="layout/js/project_carousel.js"></script>
<script type="text/javascript" src="layout/js/jquery.prettyPhoto.js"></script><!-- Necessary for Popups -->
<script type="text/javascript" src="layout/js/popups.js"></script>
<script type="text/javascript" src="layout/js/main.js"></script>
<script type="text/javascript" src="layout/js/jquery.cookie.js"></script>
<script type="text/javascript" src="layout/js/theme_settings.js"></script>
<script type="text/javascript" src="layout/js/jquery.cookie.js"></script>
<script type="text/javascript" src="layout/js/theme_settings.js"></script>
</head>

<body>
<div class="pattern"></div>
<div class="main_bg"></div>
<div class="wrapper">
    	<!-- HEADER BEGIN -->
	<div id="header">
		<div class="inner">
			<div class="section_top">
				<div class="block_top_text">
					<p>Dogs In Pocket - keep Your dogs close</p>
				</div>
				<div class="block_search">
					<div id="search_show" class="button">Search</div>
					<div id="search_form_block" class="form_wrapper">
						<div class="form">
							<form action="#">
								<div class="field">
									<input type="text" class="w_def_text" title="Site search" />
								</div>
								<input type="submit" class="button" value="Search" />
							</form>
						</div>
					</div>
				</div>
				<div class="block_top_lnks">
					<ul>
						<li><a href="#sign_popup" name="sign_pop" rel="prettyPhoto[gallery0]">Sign in</a></li>
						<li><a href="#reg_popup" name="reg_pop" rel="prettyPhoto[gallery00]">Registration</a></li>
					</ul>
				</div>
			</div>
			<div class="section_bottom">
				<div id="title_top">
					<p><a href="homepage"><img src="layout/images/title.png" alt="Dogs In Pocket" title="Dogs In Pocket" /></a></p>
				</div>
				<div id="main_menu">
					<ul>
						<li class="active"><a href="homepage">Home</a></li>
						<li><a href="DogsView">Dogs</a></li>
						<li><a href="additional_elements.html">Features</a>
							<ul>
								<li><a href="pricing_table.html">Pricing table</a></li>
								<li><a href="additional_elements.html">Additional elements</a></li>
								<li><a href="columns.html">Columns</a></li>
								<li><a href="services.html">Services</a></li>
								<li><a href="archives.html">Archives</a></li>
								<li><a href="404.html">Page 404</a></li>
							</ul>
						</li>
						<li><a href="portfolio_2c.html">Portfolio</a>
							<ul>
								<li><a href="portfolio_2c.html">Portfolio 2 columns</a></li>
								<li><a href="portfolio_3c.html">Portfolio 3 columns</a></li>
								<li><a href="portfolio_4c.html">Portfolio 4 columns</a></li>
								<li><a href="portfolio_with_sidebar_2c.html">Portfolio With Right Sidebar</a>
									<ul>
										<li><a href="portfolio_with_sidebar_2c.html">2 Columns Right Sidebar</a></li>
										<li><a href="portfolio_with_sidebar_3c.html">3 Columns Right Sidebar</a></li>
									</ul>
								</li>
								<li><a href="portfolio_with_link_2c.html">Portfolio With Link Button</a>
									<ul>
										<li><a href="portfolio_with_link_2c.html">2 Columns With Link Button</a></li>
										<li><a href="portfolio_with_link_3c.html">3 Columns With Link Button</a></li>
										<li><a href="portfolio_with_link_4c.html">4 Columns With Link Button</a></li>
									</ul>
								</li>
								<li><a href="portfolio_gallery.html">Portfolio Gallery Style </a>
									<ul>
										<li><a href="portfolio_gallery.html">Gallery With Right Sidebar</a></li>
										<li><a href="portfolio_gallery_full.html">Galley Full Width</a></li>
									</ul>
								</li>
								<li><a href="portfolio_item.html">Portfolio Item Page</a></li>
							</ul>
						</li>
						<li><a href="blog_1.html">Blog</a>
							<ul>
								<li><a href="blog_1.html">Blog Style 1</a></li>
								<li><a href="blog_2.html">Blog Style 2</a></li>
								<li><a href="blog_right_1.html">Blog Style 3</a></li>
								<li><a href="blog_right_2.html">Blog Style 4</a></li>
								<li><a href="blog_right_3.html">Blog Style 5</a></li>
								<li><a href="blog_full_width.html">Blog full width</a></li>
								<li><a href="blog_post.html">Blog post page</a></li>
							</ul>
						</li>
						<li><a href="about.html">About</a></li>
						<li><a href="contact.php">Contact</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- HEADER END --> 
        
        <!-- CONTENT BEGIN -->
        <div id="content">
        	<div class="inner">
            	<div class="block_content_top">
                	<div class="block_page_title">
                    	<p class="title">Dogs</p>
                        <p class="subtitle">This is a test dogs view.</p>
                    </div>
                    
                    <div class="block_back"><p><a href="homepage">Back to Home Page »</a></p></div>
                    <h1>${dogs}</h1>
                </div>
                
                <div class="separator_1"></div>
        	</div>
        </div>
        <!-- CONTENT END -->
            
        <!-- FOOTER BEGIN -->
        <div id="footer">
            <div class="section_top">
            	<div class="inner">
                	<div class="col_1">
                        <div id="title_bottom"><p><a href="home.html"><img src="layout/images/spacer.gif" alt="WebSplash" title="WebSplash" /></a></p></div>
                        
                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration some form, by injected  randomised words which don't look even slightly If you are going to use... <a href="#"><img src="layout/images/arrow_6.gif" alt="" /></a></p>
                    </div>
                    
                    <div class="col_2">
                    	<h3>Latest Tweets</h3>
                        
                        <div class="block_footer_latest_tweets">
                        	<p>8 Web Marketing &amp; Joomla Development Services For Online</p>
                            <p><a href="#">http://bit.ly/rlsT7h</a></p>
                            <p class="date">15 minutes ago</p>
                        </div>
                        
                        <div class="line_2"></div>
                        
                        <div class="block_footer_latest_tweets">
                        	<p>Tumblr Importer plugin lets you move blog from Tumblr to WordPress</p>
                            <p><a href="#">http://thenextweb.com/apps/2011</a></p>
                            <p class="date">26 minutes ago</p>
                        </div>
                    </div>
                    
                    <div class="col_3">
                    	<h3>Recent Posts</h3>
                        
                        <div class="block_footer_recent_posts">
                            <p><a href="#">There are many variations of passages of Lorem Ipsum available...</a></p>
                            <p class="date">September 15, 2011 - 10 Comments</p>
                        </div>
                        
                        <div class="line_2"></div>
                        
                        <div class="block_footer_recent_posts">
                        	<p><a href="#">Available, but the majority have suffered alteration in some form, by injected humour...</a></p>
                            <p class="date">May 18, 2011 - 10 Comments</p>
                        </div>
                    </div>
                    
                    <div class="col_4">
                    	<h3>Flickr</h3>
                        
                        <div class="block_flickr">
                        	<a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_1.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_2.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_3.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_4.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_5.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_6.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_7.jpg" alt="" /><span>&nbsp;</span></a>
                            <a href="http://www.flickr.com/" target="_blank"><img src="images/45x45/pic_flickr_8.jpg" alt="" /><span>&nbsp;</span></a>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="section_bottom">
            	<div class="inner">
                	<div class="block_copyrights"><p>Copyright &copy; 2010 Web Splash. Theme by Web Vision</p></div>
                    
                    <div class="block_follow_us">
                    	<div class="text"><p>Follow us:</p></div>
                        
                        <div class="block_social_1 fl">
                        	<a href="#" class="twitter">Twitter</a>
                            <a href="#" class="facebook">Facebook</a>
                            <a href="#" class="rss">RSS</a>
                            <a href="#" class="linked_in">Linked In</a>
                            <a href="#" class="deviart">Deviart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       <!-- FOOTER END --> 
</div>
<!-- sign form -->
<div class="disp_none">
	<div id="reg_popup">
		<div class="sign_popup">
			<h2>Registration</h2>
			<h3>Register in to your account</h3>
			<form action="" method="post" id="f_sign">
				<div class="inp_line">
					<label>Login:</label>
					<div class="field"><input type="text" class="w_focus" name="name" /></div>
				</div>
				<div class="inp_line">
					<label>E-mail:</label>
					<div class="field"><input type="text" class="w_focus" name="email" /></div>
				</div>
				<div class="inp_line">
					<label>Password:</label>
					<div class="field"><input type="text" class="w_focus" name="passw" /></div>
				</div>
				<div class="inp_checkbox">
					<div class="inp_checkbox_in"><label><input type="checkbox" checked="checked" value="" class="styled" name="ch1" id="ch1" />
						<span>Remember me?</span> </label></div>
					<a href="javascript:;" onclick="document.forms['f_sign'].submit();" class="button_lnk blue fl def_link"><span>Register</span></a> </div>
			</form>
		</div>
	</div>
	
	<div id="sign_popup">
		<div class="sign_popup">
			<h2>Authorization on the site</h2>
			<h3>Sign in to your account</h3>
			<form action="" method="post" id="f_sign2">
				<div class="inp_line">
					<label>Login:</label>
					<div class="field"><input type="text" class="w_focus" name="name" /></div>
				</div>
				<div class="inp_line">
					<label>Password:</label>
					<div class="field"><input type="text" class="w_focus" name="passw" /></div>
				</div>
				<div class="inp_checkbox">
					<div class="inp_checkbox_in"><a href="#">Forgot your password?</a></div>
					<a href="javascript:;" onclick="document.forms['f_sign2'].submit();" class="button_lnk blue fl def_link"><span>Sign In</span></a> </div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
</html>
