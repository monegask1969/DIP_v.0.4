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
						<li class="active"><a href="home.html">Home</a></li>
                                                <li><a href="slider_accordion.html">Dog's Table</a></li>
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
                    	<p class="title">Dogs Table</p>
                        <p class="subtitle">This is a test page of table view.</p>
                    </div>
                    
                    <div class="block_back"><p><a href="home.html">Back to Home Page »</a></p></div>
                </div>
                
                <div class="separator_1"></div>
                
                <form action="" method="get">
                <div class="block_typography">
                                            <div class="column_3 fl">
                            <table border="0" cellpadding="0" cellspacing="0" class="table_type_1">
                                <tr>
                                <!--<tr  onclick="sub('1')">-->
                                    <th>id</th>
                                    <th>FCI Group</th>
                                    <th>Breed</th>
                                    <th>Gender</th>
                                    <th>Name</th>
                                    <th>Date Of Birth</th>
                                    <th>Color</th>
                                    <th>Chip</th>
                                    <th>Brand</th>
                                    <th>Pedigree</th>
                                    <th>Sire</th>
                                    <th>Dam</th>
                                    <th>Owner's name</th>
                                    <th>Owner's city</th>
                                    <th class="last">Breeder's name</th>
                                </tr>
                              <c:forEach var="d" items="${dogs}">
                                <tr id="dog_${d.id}">   
                                <td>${d.fCIgroup}</td>
                                <td>${d.breed}</td>
                                <td>${d.gender}</td>
                                <td>${d.name}</td>
                                <td>${d.dob}</td>
                                <td>${d.color}</td>
                                <td>${d.chip}</td>
                                <td>${d.brand}</td>
                                <td>${d.pedigree}</td>
                                <td>${d.sire}</td>
                                <td>${d.dam}</td>
                                <td>${d.oLname}</td>
                                <td>${d.ownerSCity}</td>
                                <td>${d.bLname}</td>
                                <!--<td><a href="users/${u.id}" onclick="return removeDog(${u.id})">delete</a></td>-->
            </tr>
            </c:forEach>
                            </table>
                        </div>
                </div>
                </form>
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