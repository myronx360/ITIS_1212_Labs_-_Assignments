<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html  dir="ltr" lang="en" xml:lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>ITIS-1212-001-Spring 2014-26906: Lab4PartE.java</title>
    <meta name="keywords" content="moodle, ITIS-1212-001-Spring 2014-26906: Lab4PartE.java" />
    <link rel="shortcut icon" href="https://moodle2.uncc.edu/theme/image.php/ctl/theme/1389023387/favicon" />
    <meta name="description" content="" />
    <meta http-equiv="X-UA-Compatible" conent="IE=edge"/> 
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="moodle, ITIS-1212-001-Spring 2014-26906: Lab4PartE.java" />
<link rel="stylesheet" type="text/css" href="https://moodle2.uncc.edu/theme/yui_combo.php?3.5.1/build/cssreset/reset-min.css&amp;3.5.1/build/cssfonts/fonts-min.css&amp;3.5.1/build/cssgrids/grids-min.css&amp;3.5.1/build/cssbase/base-min.css" /><script type="text/javascript" src="https://moodle2.uncc.edu/theme/yui_combo.php?3.5.1/build/yui/yui-min.js"></script><script type="text/javascript" src="https://moodle2.uncc.edu/theme/yui_combo.php?2.9.0/build/yahoo/yahoo-min.js&amp;2.9.0/build/dom/dom-min.js"></script>
<link rel="stylesheet" type="text/css" href="https://moodle2.uncc.edu/theme/yui_combo.php?2.9.0/build/assets/skins/sam/skin.css" />
<script id="firstthemesheet" type="text/css">/** Required in order to fix style inclusion problems in IE with YUI **/</script><link rel="stylesheet" type="text/css" href="https://moodle2.uncc.edu/theme/styles.php/ctl/1389023387/all" />
<script type="text/javascript">
//<![CDATA[
var M = {}; M.yui = {}; var moodleConfigFn = function(me) {var p = me.path, b = me.name.replace(/^moodle-/,'').split('-', 3), n = b.pop();if (/(skin|core)/.test(n)) {n = b.pop();me.type = 'css';};me.path = b.join('-')+'/'+n+'/'+n+'.'+me.type;}; var galleryConfigFn = function(me) {var p = me.path,v=M.yui.galleryversion,f;if(/-(skin|core)/.test(me.name)) {me.type = 'css';p = p.replace(/-(skin|core)/, '').replace(/\.js/, '.css').split('/'), f = p.pop().replace(/(\-(min|debug))/, '');if (/-skin/.test(me.name)) {p.splice(p.length,0,v,'assets','skins','sam', f);} else {p.splice(p.length,0,v,'assets', f);};} else {p = p.split('/'), f = p.pop();p.splice(p.length,0,v, f);};me.path = p.join('/');};
M.yui.loader = {"base":"https:\/\/moodle2.uncc.edu\/lib\/yui\/3.5.1\/build\/","comboBase":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?","combine":true,"filter":"","insertBefore":"firstthemesheet","modules":{"yui2-event":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/event\/event-min.js","async":false},"yui2-animation":{"type":"js","requires":["yui2-dom","yui2-event"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/animation\/animation-min.js","async":false},"yui2-swfstore":{"type":"js","requires":["yui2-element","yui2-cookie","yui2-swf"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/swfstore\/swfstore-min.js","async":false},"yui2-datatable":{"requires":["yui2-element","yui2-datasource"],"type":"js","optional":["yui2-calendar","yui2-dragdrop","yui2-paginator"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/datatable\/datatable-min.js","async":false},"yui2-swfdetect":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/swfdetect\/swfdetect-min.js","async":false},"yui2-menu":{"requires":["yui2-containercore"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/menu\/menu-min.js","async":false},"yui2-treeview":{"requires":["yui2-event","yui2-dom"],"type":"js","optional":["yui2-json","yui2-animation","yui2-calendar"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/treeview\/treeview-min.js","async":false},"yui2-get":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/get\/get-min.js","async":false},"yui2-progressbar":{"requires":["yui2-element"],"type":"js","optional":["yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/progressbar\/progressbar-min.js","async":false},"yui2-uploader":{"type":"js","requires":["yui2-element"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/uploader\/uploader-min.js","async":false},"yui2-datasource":{"requires":["yui2-event"],"type":"js","optional":["yui2-connection"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/datasource\/datasource-min.js","async":false},"yui2-profiler":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/profiler\/profiler-min.js","async":false},"yui2-connection":{"supersedes":["yui2-connectioncore"],"requires":["yui2-event"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/connection\/connection-min.js","async":false},"yui2-json":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/json\/json-min.js","async":false},"yui2-datemath":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/datemath\/datemath-min.js","async":false},"yui2-calendar":{"supersedes":["yui2-datemath"],"requires":["yui2-event","yui2-dom"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/calendar\/calendar-min.js","async":false},"yui2-simpleeditor":{"requires":["yui2-element"],"type":"js","optional":["yui2-containercore","yui2-menu","yui2-button","yui2-animation","yui2-dragdrop"],"pkg":"editor","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/editor\/simpleeditor-min.js","async":false},"yui2-swf":{"supersedes":["yui2-swfdetect"],"requires":["yui2-element"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/swf\/swf-min.js","async":false},"yui2-event-simulate":{"type":"js","requires":["yui2-event"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/event-simulate\/event-simulate-min.js","async":false},"yui2-yuiloader-dom-event":{"supersedes":["yui2-yahoo","yui2-dom","yui2-event","yui2-get","yui2-yuiloader","yui2-yahoo-dom-event"],"rollup":5,"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/yuiloader-dom-event\/yuiloader-dom-event.js","async":false},"yui2-storage":{"requires":["yui2-yahoo","yui2-event","yui2-cookie"],"type":"js","optional":["yui2-swfstore"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/storage\/storage-min.js","async":false},"yui2-container":{"supersedes":["yui2-containercore"],"requires":["yui2-dom","yui2-event"],"type":"js","optional":["yui2-dragdrop","yui2-animation","yui2-connection"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/container\/container-min.js","async":false},"yui2-profilerviewer":{"requires":["yui2-profiler","yui2-yuiloader","yui2-element"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/profilerviewer\/profilerviewer-min.js","async":false},"yui2-imagecropper":{"requires":["yui2-dragdrop","yui2-element","yui2-resize"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/imagecropper\/imagecropper-min.js","async":false},"yui2-paginator":{"requires":["yui2-element"],"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/paginator\/paginator-min.js","async":false},"yui2-tabview":{"requires":["yui2-element"],"type":"js","optional":["yui2-connection"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/tabview\/tabview-min.js","async":false},"yui2-layout":{"requires":["yui2-element"],"type":"js","optional":["yui2-animation","yui2-dragdrop","yui2-resize","yui2-selector"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/layout\/layout-min.js","async":false},"yui2-imageloader":{"type":"js","requires":["yui2-event","yui2-dom"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/imageloader\/imageloader-min.js","async":false},"yui2-containercore":{"requires":["yui2-dom","yui2-event"],"type":"js","pkg":"container","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/container\/container_core-min.js","async":false},"yui2-event-mouseenter":{"type":"js","requires":["yui2-dom","yui2-event"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/event-mouseenter\/event-mouseenter-min.js","async":false},"yui2-logger":{"requires":["yui2-event","yui2-dom"],"type":"js","optional":["yui2-dragdrop"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/logger\/logger-min.js","async":false},"yui2-cookie":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/cookie\/cookie-min.js","async":false},"yui2-stylesheet":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/stylesheet\/stylesheet-min.js","async":false},"yui2-connectioncore":{"requires":["yui2-event"],"type":"js","pkg":"connection","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/connection\/connection_core-min.js","async":false},"yui2-utilities":{"supersedes":["yui2-yahoo","yui2-event","yui2-dragdrop","yui2-animation","yui2-dom","yui2-connection","yui2-element","yui2-yahoo-dom-event","yui2-get","yui2-yuiloader","yui2-yuiloader-dom-event"],"rollup":8,"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/utilities\/utilities.js","async":false},"yui2-dragdrop":{"type":"js","requires":["yui2-dom","yui2-event"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/dragdrop\/dragdrop-min.js","async":false},"yui2-colorpicker":{"requires":["yui2-slider","yui2-element"],"type":"js","optional":["yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/colorpicker\/colorpicker-min.js","async":false},"yui2-event-delegate":{"requires":["yui2-event"],"type":"js","optional":["yui2-selector"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/event-delegate\/event-delegate-min.js","async":false},"yui2-yuiloader":{"type":"js","supersedes":["yui2-yahoo","yui2-get"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/yuiloader\/yuiloader-min.js","async":false},"yui2-button":{"requires":["yui2-element"],"type":"js","optional":["yui2-menu"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/button\/button-min.js","async":false},"yui2-resize":{"requires":["yui2-dragdrop","yui2-element"],"type":"js","optional":["yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/resize\/resize-min.js","async":false},"yui2-element":{"requires":["yui2-dom","yui2-event"],"type":"js","optional":["yui2-event-mouseenter","yui2-event-delegate"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/element\/element-min.js","async":false},"yui2-history":{"type":"js","requires":["yui2-event"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/history\/history-min.js","async":false},"yui2-yahoo":{"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/yahoo\/yahoo-min.js","async":false},"yui2-element-delegate":{"type":"js","requires":["yui2-element"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/element-delegate\/element-delegate-min.js","async":false},"yui2-charts":{"type":"js","requires":["yui2-element","yui2-json","yui2-datasource","yui2-swf"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/charts\/charts-min.js","async":false},"yui2-slider":{"requires":["yui2-dragdrop"],"type":"js","optional":["yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/slider\/slider-min.js","async":false},"yui2-selector":{"type":"js","requires":["yui2-yahoo","yui2-dom"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/selector\/selector-min.js","async":false},"yui2-yuitest":{"requires":["yui2-logger"],"type":"js","optional":["yui2-event-simulate"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/yuitest\/yuitest-min.js","async":false},"yui2-carousel":{"requires":["yui2-element"],"type":"js","optional":["yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/carousel\/carousel-min.js","async":false},"yui2-autocomplete":{"requires":["yui2-dom","yui2-event","yui2-datasource"],"type":"js","optional":["yui2-connection","yui2-animation"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/autocomplete\/autocomplete-min.js","async":false},"yui2-yahoo-dom-event":{"supersedes":["yui2-yahoo","yui2-event","yui2-dom"],"rollup":3,"type":"js","fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/yahoo-dom-event\/yahoo-dom-event.js","async":false},"yui2-dom":{"type":"js","requires":["yui2-yahoo"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/dom\/dom-min.js","async":false},"yui2-editor":{"supersedes":["yui2-simpleeditor"],"requires":["yui2-menu","yui2-element","yui2-button"],"type":"js","optional":["yui2-animation","yui2-dragdrop"],"fullpath":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?2.9.0\/build\/editor\/editor-min.js","async":false},"core_filepicker":{"name":"core_filepicker","fullpath":"https:\/\/moodle2.uncc.edu\/lib\/javascript.php\/1389023387\/repository\/filepicker.js","requires":["base","node","node-event-simulate","json","async-queue","io-base","io-upload-iframe","io-form","yui2-treeview","panel","cookie","datatable","datatable-sort","resize-plugin","dd-plugin","escape","moodle-core_filepicker"]},"core_dock":{"name":"core_dock","fullpath":"https:\/\/moodle2.uncc.edu\/lib\/javascript.php\/1389023387\/blocks\/dock.js","requires":["base","node","event-custom","event-mouseenter","event-resize"]}},"groups":{"moodle":{"name":"moodle","base":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?moodle\/1389023387\/","comboBase":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?","combine":true,"filter":"","ext":false,"root":"moodle\/1389023387\/","patterns":{"moodle-":{"group":"moodle","configFn":moodleConfigFn},"root":"moodle"}},"local":{"name":"gallery","base":"https:\/\/moodle2.uncc.edu\/lib\/yui\/gallery\/","comboBase":"https:\/\/moodle2.uncc.edu\/theme\/yui_combo.php?","combine":true,"filter":"","ext":false,"root":"gallery\/","patterns":{"gallery-":{"group":"gallery","configFn":galleryConfigFn},"root":"gallery"}}}};
M.cfg = {"wwwroot":"https:\/\/moodle2.uncc.edu","sesskey":"k0C1i2yYPV","loadingicon":"https:\/\/moodle2.uncc.edu\/theme\/image.php\/ctl\/core\/1389023387\/i\/loading_small","themerev":"1389023387","slasharguments":1,"theme":"ctl","jsrev":"1389023387"};
//]]>
</script>
<script type="text/javascript" src="https://moodle2.uncc.edu/lib/javascript.php/1389023387/lib/javascript-static.js"></script>
<script type="text/javascript" src="https://moodle2.uncc.edu/theme/javascript.php/ctl/1389023387/head"></script>
    <script language="javascript">
        function submitform() {
            document.helpdesk.submit();
        }
    </script>
</head>
<body id="page-mod-resource-view" onload="setfocus()" class=" path-mod path-mod-resource gecko dir-ltr lang-en yui-skin-sam yui3-skin-sam moodle2-uncc-edu pagelayout-incourse course-43454 context-831965 cmid-392544 category-17 side-pre-only">
<div class="skiplinks"><a class="skip" href="#maincontent">Skip to main content</a></div>
<script type="text/javascript">
//<![CDATA[
document.body.className += ' jsenabled';
//]]>
</script>


<div id="page">

<!-- START OF HEADER -->

	<div id="wrapper" class="clearfix">

    	<div id="page-header">
			<div id="page-header-wrapper" class="clearfix">
                <div id="brand" class="headermain">
                    <img src="https://moodle2.uncc.edu/theme/image.php/ctl/theme/1389023387/branded_logo" style="width:150px; height:60px;" />
                    <div class="welcometitle_course">ITIS-1212-001-Spring 2014-26906: Lab4PartE.java</div>
                    <img class="moodle2_img" src="https://moodle2.uncc.edu/theme/image.php/ctl/theme/1389023387/Moodle2"/>
                    <div class="clearfix navbar">
                        <div class="breadcrumb" style="padding-top:10px;"><span class="accesshide">Page path</span><ul><li><a href="https://moodle2.uncc.edu/">Home</a></li><li> <span class="accesshide " ><span class="arrow_text">/</span>&nbsp;</span><span class="arrow sep">&#x25BA;</span> <span tabindex="0">My courses</span></li><li> <span class="accesshide " ><span class="arrow_text">/</span>&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a title="ITIS-1212-001-Spring 2014-Intro to Media Programming" href="https://moodle2.uncc.edu/course/view.php?id=43454">ITIS-1212-001-Spring 2014-26906</a></li><li> <span class="accesshide " ><span class="arrow_text">/</span>&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a href="https://moodle2.uncc.edu/course/view.php?id=43454&amp;section=4">Jan 27-31 -- Concepts, Terms</a></li><li> <span class="accesshide " ><span class="arrow_text">/</span>&nbsp;</span><span class="arrow sep">&#x25BA;</span> <a title="File" href="https://moodle2.uncc.edu/mod/resource/view.php?id=392544" id="action_link52e9475e3edc63">Lab4PartE.java</a></li></ul></div>
                        <div class="headermenu">
                            <ul>
                                <li>
                                    <form action="https://teaching1.uncc.edu/forms/helpdesk.php" method="post" name="helpdesk" target="help" onsubmit="window.open('','help','width=540,height=720,status=yes,resizable=yes,scrollbars=yes')">
                                                                                <input type="hidden" name="username" value="mwill320" />
                                        <input type="hidden" name="bannerid" value="526999" />
                                        <input type="hidden" name="lastname" value="Williams" />
                                        <input type="hidden" name="firstname" value="Myron" />
                                        <input type="hidden" name="email" value="mwill320@uncc.edu" />
                                        <input type="hidden" name="lastaccess" value="1391019827" />
                                        <input type="hidden" name="lastlogin" value="1390950443" />
                                        <input type="hidden" name="ipaddress" value="172.9.157.217" />
                                        <input type="hidden" name="coursefullname" value="ITIS-1212-001-Spring 2014-26906: Lab4PartE.java" />
                                        <input type="hidden" name="courseurl" value="https://moodle2.uncc.edu/mod/resource/view.php?id=392544" />
                                        <a href="javascript: submitform()">Get Help</a>
                                    </form>
                                </li>
                                <li>
                                    <a href="http://teaching.uncc.edu/moodle2/faqs" title="Moodle FAQs" target="_blank">FAQ</a>
                                </li>
                                <li>
                                    <div class="logininfo"><a href="https://moodle2.uncc.edu/user/profile.php?id=69589" title="View profile"> </a> <a href="https://moodle2.uncc.edu/login/logout.php?sesskey=k0C1i2yYPV">Logout</a></div>                                </li>
                            </ul>
                        </div>
                     </div>
                </div>
                <div class="navbutton" style="padding-right: 10px; padding-top:3px;">
                                    </div>
	    	</div>
	    </div>

        <div class="clearer"></div> <!-- temporarily added on 06/25/10 -->

<!-- END OF HEADER -->

<!-- START OF CONTENT -->

		<div id="page-content-wrapper" class="clearfix">
    		<div id="page-content">
	    	    <div id="region-main-box">
    	    	    <div id="region-post-box">

        	    	    <div id="region-main-wrap">
            	    	    <div id="region-main">
                	    	    <div class="region-content">
                    	    	    <span id="maincontent"></span><h2 id="resourceheading" class="main">Lab4PartE.java</h2><div class="resourceworkaround">Click <a href="https://moodle2.uncc.edu/pluginfile.php/831965/mod_resource/content/1/Lab4PartE.java" onclick="window.open('https://moodle2.uncc.edu/pluginfile.php/831965/mod_resource/content/1/Lab4PartE.java', '', 'width=620,height=450,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false;">Lab4PartE.java</a> link to view the file.</div>	                        	</div>
		                    </div>
    		            </div>

        		                    		    <div id="region-pre">
                		    <div class="region-content">
                    		    <a href="#sb-1" class="skip-block">Skip Navigation</a><div id="inst5" class="block_navigation  block"><div class="header"><div class="title"><div class="block_action"></div><h2>Navigation</h2></div></div><div class="content"><ul class="block_tree list"><li class="type_unknown depth_1 contains_branch" aria-expanded="true"><p class="tree_item branch navigation_node"><a href="https://moodle2.uncc.edu/">Home</a></p><ul><li class="type_setting depth_2 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><a href="https://moodle2.uncc.edu/my/">My home</a></p><ul><li class="type_system depth_3 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/local/mymedia/mymedia.php"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />My Media</a></p></li></ul></li>
<li class="type_user depth_2 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><span tabindex="0">My profile</span></p><ul><li class="type_custom depth_3 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/user/profile.php?id=69589"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />View profile</a></p></li>
<li class="type_custom depth_3 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><span tabindex="0">Forum posts</span></p><ul><li class="type_custom depth_4 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/mod/forum/user.php?id=69589"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Posts</a></p></li>
<li class="type_custom depth_4 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/mod/forum/user.php?id=69589&amp;mode=discussions"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Discussions</a></p></li></ul></li>
<li class="type_setting depth_3 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/user/files.php"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />My private files</a></p></li></ul></li>
<li class="type_system depth_2 contains_branch" aria-expanded="true"><p class="tree_item branch"><span tabindex="0">My courses</span></p><ul><li class="type_category depth_3 contains_branch" aria-expanded="true"><p class="tree_item branch canexpand"><span tabindex="0">Spring 2014</span></p><ul><li class="type_course depth_4 contains_branch" aria-expanded="true"><p class="tree_item branch"><a title="ITIS-1212-001-Spring 2014-Intro to Media Programming" href="https://moodle2.uncc.edu/course/view.php?id=43454">ITIS-1212-001-Spring 2014-26906</a></p><ul><li class="type_unknown depth_5 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><a href="https://moodle2.uncc.edu/user/index.php?id=43454">Participants</a></p><ul><li class="type_user depth_6 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><a href="https://moodle2.uncc.edu/user/view.php?id=69589&amp;course=43454">Myron Williams</a></p><ul><li class="type_custom depth_7 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/user/view.php?id=69589&amp;course=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />View profile</a></p></li>
<li class="type_custom depth_7 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><span tabindex="0">Forum posts</span></p><ul><li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/mod/forum/user.php?id=69589&amp;course=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Posts</a></p></li>
<li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/mod/forum/user.php?id=69589&amp;course=43454&amp;mode=discussions"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Discussions</a></p></li></ul></li>
<li class="type_setting depth_7 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/user/files.php"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />My private files</a></p></li>
<li class="type_custom depth_7 collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><span tabindex="0">Activity reports</span></p><ul><li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/report/log/user.php?id=69589&amp;course=43454&amp;mode=today"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Today's logs</a></p></li>
<li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/report/log/user.php?id=69589&amp;course=43454&amp;mode=all"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />All logs</a></p></li>
<li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/report/outline/user.php?id=69589&amp;course=43454&amp;mode=outline"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Outline report</a></p></li>
<li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/report/outline/user.php?id=69589&amp;course=43454&amp;mode=complete"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Complete report</a></p></li>
<li class="type_custom depth_8 item_with_icon"><p class="tree_item leaf hasicon"><a href="https://moodle2.uncc.edu/course/user.php?mode=grade&amp;id=43454&amp;user=69589"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Grade</a></p></li></ul></li></ul></li></ul></li>
<li class="type_structure depth_5 contains_branch" aria-expanded="true"><p class="tree_item branch"><a href="https://moodle2.uncc.edu/course/view.php?id=43454&amp;section=4">Jan 27-31 -- Concepts, Terms</a></p><ul><li class="type_activity depth_6 item_with_icon current_branch"><p class="tree_item leaf hasicon active_tree_node"><a title="File" href="https://moodle2.uncc.edu/mod/resource/view.php?id=392544" id="action_link52e9475e3edc61"><img alt="File" class="smallicon navicon" title="File" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/f/sourcecode" />Lab4PartE.java</a></p></li></ul></li></ul></li>
<li class="type_course depth_4 collapsed item_with_icon"><p class="tree_item leaf hasicon" id="expandable_branch_20_43017"><a title="ITCS-2600-006-Spring 2014-Computing Professionals Sem II" href="https://moodle2.uncc.edu/course/view.php?id=43017"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />ITCS-2600-006-Spring 2014-26642</a></p></li>
<li class="type_course depth_4 collapsed item_with_icon"><p class="tree_item leaf hasicon" id="expandable_branch_20_37144"><a title="ITIS-2110-090-Spring 2014-IT Infrastruct I: Desgn/Pract" href="https://moodle2.uncc.edu/course/view.php?id=37144"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />ITIS-2110-090-Spring 2014-22500</a></p></li>
<li class="type_course depth_4 collapsed item_with_icon"><p class="tree_item leaf hasicon" id="expandable_branch_20_42946"><a title="ITCS-2600-001:ITCS-2600-002:ITCS-2600-003:ITCS-2600-004:ITCS-2600-005:ITCS-2600-006_Combined (Spring 2014)" href="https://moodle2.uncc.edu/course/view.php?id=42946"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />201410-ITCS-2600-001:ITCS-2600-002:ITCS-2600-003:I...</a></p></li></ul></li></ul></li></ul></li></ul></div></div><span id="sb-1" class="skip-block-to"></span><a href="#sb-2" class="skip-block">Skip Activities</a><div id="inst85389" class="block_activity_modules  block list_block"><div class="header"><div class="title"><div class="block_action"></div><h2>Activities</h2></div></div><div class="content"><ul class="unlist"><li class="r0"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/assign/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/assign/1389023387/icon" class="icon" alt="" />&nbsp;Assignments</a></div></li>
<li class="r1"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/attendance/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/attendance/1389023387/icon" class="icon" alt="" />&nbsp;Attendances</a></div></li>
<li class="r0"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/oublog/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/oublog/1389023387/icon" class="icon" alt="" />&nbsp;Blogs</a></div></li>
<li class="r1"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/feedback/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/feedback/1389023387/icon" class="icon" alt="" />&nbsp;Feedback</a></div></li>
<li class="r0"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/forum/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/forum/1389023387/icon" class="icon" alt="" />&nbsp;Forums</a></div></li>
<li class="r1"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/glossary/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/glossary/1389023387/icon" class="icon" alt="" />&nbsp;Glossaries</a></div></li>
<li class="r0"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/hotpot/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/hotpot/1389023387/icon" class="icon" alt="" />&nbsp;Hot Potatoes Quizzes</a></div></li>
<li class="r1"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/quiz/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/quiz/1389023387/icon" class="icon" alt="" />&nbsp;Quizzes</a></div></li>
<li class="r0"><div class="column c1"><a href="https://moodle2.uncc.edu/course/resources.php?id=43454"><img class="icon" alt="" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/f/html" />&nbsp;Resources</a></div></li>
<li class="r1"><div class="column c1"><a href="https://moodle2.uncc.edu/mod/stampcoll/index.php?id=43454"><img src="https://moodle2.uncc.edu/theme/image.php/ctl/stampcoll/1389023387/icon" class="icon" alt="" />&nbsp;Stamp collections</a></div></li></ul></div></div><span id="sb-2" class="skip-block-to"></span><a href="#sb-3" class="skip-block">Skip Settings</a><div id="inst6" class="block_settings  block"><div class="header"><div class="title"><div class="block_action"></div><h2>Settings</h2></div></div><div class="content"><div id="settingsnav" class="box block_tree_box"><ul class="block_tree list"><li class="type_course collapsed contains_branch" aria-expanded="false"><p class="tree_item branch root_node"><span tabindex="0">Course administration</span></p><ul><li class="type_setting collapsed item_with_icon"><p class="tree_item leaf"><a href="https://moodle2.uncc.edu/grade/report/index.php?id=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/grades" />Grades</a></p></li></ul></li>
<li class="type_unknown collapsed contains_branch" aria-expanded="false"><hr /><p class="tree_item branch root_node" id="usersettings"><span tabindex="0">My profile settings</span></p><ul><li class="type_setting collapsed item_with_icon"><p class="tree_item leaf"><a href="https://moodle2.uncc.edu/user/edit.php?id=69589&amp;course=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Edit profile</a></p></li>
<li class="type_setting collapsed contains_branch" aria-expanded="false"><p class="tree_item branch"><span tabindex="0">Portfolios</span></p><ul><li class="type_setting collapsed item_with_icon"><p class="tree_item leaf"><a href="https://moodle2.uncc.edu/user/portfolio.php?courseid=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Configure</a></p></li>
<li class="type_setting collapsed item_with_icon"><p class="tree_item leaf"><a href="https://moodle2.uncc.edu/user/portfoliologs.php?courseid=43454"><img alt="" class="smallicon navicon" title="" src="https://moodle2.uncc.edu/theme/image.php/ctl/core/1389023387/i/navigationitem" />Transfer logs</a></p></li></ul></li></ul></li></ul></div></div></div><span id="sb-3" class="skip-block-to"></span>		                    </div>
    		            </div>
        		        
	        	        
	        	    </div>
	    	    </div>
		    </div>
		</div>

<!-- END OF CONTENT -->

<!-- START OF FOOTER -->

	    <div id="page-footer">
    	    <p class="helplink"></p>

	        <div class="logininfo">You are logged in as <a href="https://moodle2.uncc.edu/user/profile.php?id=69589" title="View profile">Myron Williams</a> (<a href="https://moodle2.uncc.edu/login/logout.php?sesskey=k0C1i2yYPV">Logout</a>)</div><div class="homelink"><a href="https://moodle2.uncc.edu/course/view.php?id=43454">ITIS-1212-001-Spring 2014-26906</a></div>    	</div>

<!-- END OF FOOTER -->

	</div> <!-- END #wrapper -->

</div><!-- END #page -->

<script type="text/javascript" src="https://moodle2.uncc.edu/lib/javascript.php/1389023387/blocks/navigation/yui/navigation/navigation.js"></script>
<script type="text/javascript" src="https://moodle2.uncc.edu/theme/javascript.php/ctl/1389023387/footer"></script>
<script type="text/javascript">
//<![CDATA[
M.str = {"moodle":{"lastmodified":"Last modified","name":"Name","error":"Error","info":"Information","viewallcourses":"View all courses","cancel":"Cancel","yes":"Yes"},"repository":{"type":"Type","size":"Size","invalidjson":"Invalid JSON string","nofilesattached":"No files attached","filepicker":"File picker","logout":"Logout","nofilesavailable":"No files available","norepositoriesavailable":"Sorry, none of your current repositories can return files in the required format.","fileexistsdialogheader":"File exists","fileexistsdialog_editor":"A file with that name has already been attached to the text you are editing.","fileexistsdialog_filemanager":"A file with that name has already been attached","renameto":"Rename to \"{$a}\"","referencesexist":"There are {$a} alias\/shortcut files that use this file as their source"},"block":{"addtodock":"Move this to the dock","undockitem":"Undock this item","undockall":"Undock all","hidedockpanel":"Hide the dock panel","hidepanel":"Hide panel"},"langconfig":{"thisdirectionvertical":"btt"},"admin":{"confirmation":"Confirmation"}};
//]]>
</script>
<script type="text/javascript">
//<![CDATA[
var navtreeexpansions5 = {"1":{"id":"expandable_branch_20_43017","key":"43017","type":20},"2":{"id":"expandable_branch_20_37144","key":"37144","type":20},"3":{"id":"expandable_branch_20_42946","key":"42946","type":20}};
//]]>
</script>
<script type="text/javascript">
//<![CDATA[
YUI(M.yui.loader).use('node', function(Y) {
M.util.load_flowplayer();
setTimeout("fix_column_widths()", 20);
function legacy_activity_onclick_handler_1(e) { e.halt(); window.open('https://moodle2.uncc.edu/mod/url/view.php?id=6035&redirect=1', '', 'width=620,height=450,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_2(e) { e.halt(); window.open('https://moodle2.uncc.edu/mod/url/view.php?id=6036&redirect=1'); return false; };
function legacy_activity_onclick_handler_3(e) { e.halt(); window.open('https://moodle2.uncc.edu/mod/url/view.php?id=6849&redirect=1'); return false; };
function legacy_activity_onclick_handler_4(e) { e.halt(); window.open('https://moodle2.uncc.edu/mod/resource/view.php?id=392544&redirect=1', '', 'width=620,height=450,toolbar=no,location=no,menubar=no,copyhistory=no,status=no,directories=no,scrollbars=yes,resizable=yes'); return false; };
function legacy_activity_onclick_handler_5(e) { e.halt(); window.open('https://moodle2.uncc.edu/mod/url/view.php?id=390851&redirect=1'); return false; };
M.yui.galleryversion="2010.04.08-12-35";Y.use("core_dock","moodle-block_navigation-navigation",function() {M.block_navigation.init_add_tree({"id":"5","instance":"5","candock":false,"courselimit":"20","expansionlimit":"20"});
});
M.yui.galleryversion="2010.04.08-12-35";Y.use("core_dock","moodle-block_navigation-navigation",function() {M.block_navigation.init_add_tree({"id":"6","instance":"6","candock":false});
});
M.util.help_popups.setup(Y);
M.util.init_block_hider(Y, {"id":"inst5","title":"Navigation","preference":"block5hidden","tooltipVisible":"Hide Navigation block","tooltipHidden":"Show Navigation block"});
M.util.init_block_hider(Y, {"id":"inst85389","title":"Activities","preference":"block85389hidden","tooltipVisible":"Hide Activities block","tooltipHidden":"Show Activities block"});
M.util.init_block_hider(Y, {"id":"inst6","title":"Settings","preference":"block6hidden","tooltipVisible":"Hide Settings block","tooltipHidden":"Show Settings block"});
Y.on('click', legacy_activity_onclick_handler_4, "#action_link52e9475e3edc61", null);
Y.on('click', legacy_activity_onclick_handler_4, "#action_link52e9475e3edc62", null);
Y.on('click', legacy_activity_onclick_handler_4, "#action_link52e9475e3edc63", null);

});
//]]>
</script>
</body>
</html>
