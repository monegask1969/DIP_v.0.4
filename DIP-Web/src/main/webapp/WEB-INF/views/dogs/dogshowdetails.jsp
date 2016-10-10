<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="icon" type="image/x-icon" href="favicon.ico" />
<link rel="shortcut icon"  href="favicon.ico" type="image/x-icon"  />
<title>WebSplash - Additional Elements</title>

<meta name="keywords" content=""/>
<meta name="description" content="" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href='http://fonts.googleapis.com/css?family=Droid+Serif:400italic|Oswald' rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="layout/style.css" type="text/css"/>
<link rel="stylesheet" href="layout/themes/theme_style.css" type="text/css"/>
<link rel="stylesheet" href="layout/plugins_styles/nivo-slider.css" type="text/css"/><!-- Necessary for Nivo slider -->
<link rel="stylesheet" href="layout/plugins_styles/prettyPhoto.css" type="text/css"/><!-- Necessary for Popups -->

<script type="text/javascript" src="layout/js/jquery.js"></script>
<script type="text/javascript" src="layout/js/main.js"></script>

<script type="text/javascript" src="layout/js/cycle.js"></script><!-- Necessary for side slider -->
<script type="text/javascript" src="layout/js/slider_side.js"></script>

<script type="text/javascript" src="layout/js/jquery.carouFredSel-5.1.0-packed.js"></script><!-- Necessary for project carousel -->
<script type="text/javascript" src="layout/js/project_carousel.js"></script>

<script type="text/javascript" src="layout/js/jquery.prettyPhoto.js"></script><!-- Necessary for Popups -->
<script type="text/javascript" src="layout/js/popups.js"></script>

<script type="text/javascript" src="layout/js/jquery.tools.min.js"></script><!-- Necessary for Tabbed content and accordion -->
<script type="text/javascript" src="layout/js/tabs.js"></script>
<script type="text/javascript" src="layout/js/accordion.js"></script>

<script type="text/javascript" src="layout/js/jquery.toggleElements.pack.js"></script><!-- Necessary for Toggle content -->
<script type="text/javascript" src="layout/js/toggle.js"></script>

<script type="text/javascript" src="layout/js/jquery.cookie.js"></script>
<script type="text/javascript" src="layout/js/theme_settings.js"></script>

<script type="text/javascript">
    function sub(n){ 
   var tr = document.getElementById(n).style; 
   if ('none'==tr.display)tr.display = 'inline'; 
   else tr.display = 'none' 
} 
</script>

</head>


<body>
<div class="pattern"></div>
<div class="main_bg"></div>
<div class="wrapper">
    	<!-- HEADER BEGIN -->
        <div id="header">
        	<div class="inner">
            	<div class="section_top">
                	<div class="block_top_text"><p>DIP - Dogs In Pocket</p></div>
                    
                    <div class="block_search">
                    	<div id="search_show" class="button">Search</div>
                        
                        <div id="search_form_block" class="form_wrapper">
                            <div class="form">
                                <form action="#">
                                    <div class="field"><input type="text" class="w_def_text" title="Site search" /></div>
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
                	<div id="title_top"><p><a href="home.html"><img src="layout/images/spacer.gif" alt="WebSplash" title="WebSplash" /></a></p></div>
                    
                    <div id="main_menu">
					<ul>
						<li><a href="${pageContext.request.contextPath}/home_page">Home</a></li>
                                                <li class="active"><a href="${pageContext.request.contextPath}/dogshow">Dog Show</a></li>
						<li><a href="${pageContext.request.contextPath}/about">About</a></li>
						<li><a href="contact.php">Contact</a></li>
					</ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- HEADER END -->
        
        <!-- CONTENT BEGIN -->
        <div id="content" class="block_typography">
		<div class="inner">
			<div class="block_content_top">
				<div class="block_page_title">
					<p class="title">Dog Show page</p>
					<p class="subtitle">This is a test Dogs Show page.</p>
				</div>
				<div class="block_back">
					<p><a href="${pageContext.request.contextPath}/home_page">Back to Home Page »</a></p>
				</div>
			</div>
			<div class="separator_1"></div>
			<div class="block_two_columns">
			
				<div class="column_14 separated_border_right_24 mt_5 fl">
                                <div class="separator_1"></div>
                                                    <c:forEach var="dsh" items="/dogshowdetails/{id}">
                                                        <div class="column_14 separated_border_right_24 mt_5 fl">
					<div class="block_blog_post">
						<div class="block_general_pic"><img src="${dsh.picture}" class="r_conner_pic" alt="" /></div>
						<div class="post_info">
							<p><span>Organizer:</span><a>${dsh.organizer}</a></p>
							<p><span>Date:</span>${dsh.date}</p>
						</div>
						<div class="post_content">
							<h1>${dsh.title}</h1>
							<p>${dsh.description}</p>
							<p>&nbsp;</p>
							<p>Sponsor of this Dog Show is</p>
							<p>${dsh.sponsor}</p>
							<p>&nbsp;</p>
							<p>Location:</p>
							<p>${dsh.adress}</p>
							<p>&nbsp;</p>
							<div class="separator_9"></div>
							<div class="line_1"></div>
						</div>
					</div>
					<div class="separator_15"></div>
					<div class="block_add_comment" id="leave_comment">
						<div class="title">
							<h1>Write to us</h1>
							<p>If you found something to change, write us, please!</p>
						</div>
                                            <!--СДЕЛАТЬ ФИДБЭК !!!--> 
						<div class="comment_form">
							<form action="" id="cont_form" method="post">
								<p>Name<span>*</span></p>
								<div class="field">
									<input type="text" class="w_focus" />
								</div>
								<p>E-mail<span>*</span></p>
								<div class="field">
									<input type="text" class="w_focus" />
								</div>
								<p>Message</p>
								<div class="textarea">
									<textarea cols="1" rows="1" class="w_focus"></textarea>
								</div>
								<div class="send"><a href="javascript:;" onclick="document.forms['cont_form'].submit();" class="button_lnk blue def_link"><span>Add Comment</span></a></div>
							</form>
						</div>
					</div>
				</div>
                                                    </c:forEach>
                                                        <div class="separator_1"></div>
                                                        <div class="line_1 w_lnk"></div>
					</div>

				</div>
			</div>
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
	</div></div>
</body>
</html>