/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-22 11:30:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Title  -->\r\n");
      out.write("    <title>Amado - Furniture Ecommerce Template | Product Details</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon  -->\r\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Core Style CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/core-style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"styles/bootstrap.min.css\">\r\n");
      out.write("\t <link rel=\"stylesheet\" href=\"styles/additionalStyles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Search Wrapper Area Start -->\r\n");
      out.write("    <div class=\"search-wrapper section-padding-100\">\r\n");
      out.write("        <div class=\"search-close\">\r\n");
      out.write("            <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                    <div class=\"search-content\">\r\n");
      out.write("                        <form action=\"#\" method=\"get\">\r\n");
      out.write("                            <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\r\n");
      out.write("                            <button type=\"submit\"><img src=\"img/core-img/search.png\" alt=\"\"></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Search Wrapper Area End -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### Main Content Wrapper Start ##### -->\r\n");
      out.write("    <div class=\"main-content-wrapper d-flex clearfix\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile Nav (max width 767px)-->\r\n");
      out.write("        <div class=\"mobile-nav\">\r\n");
      out.write("            <!-- Navbar Brand -->\r\n");
      out.write("            <div class=\"amado-navbar-brand\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\"><img src=\"img/core-img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Navbar Toggler -->\r\n");
      out.write("            <div class=\"amado-navbar-toggler\">\r\n");
      out.write("                <span></span><span></span><span></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header Area Start -->\r\n");
      out.write("        <header class=\"header-area clearfix\">\r\n");
      out.write("            <!-- Close Icon -->\r\n");
      out.write("            <div class=\"nav-close\">\r\n");
      out.write("                <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Logo -->\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\"><img src=\"img/core-img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Amado Nav -->\r\n");
      out.write("            <nav class=\"amado-nav\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/shop\">Shop</a></li>\r\n");
      out.write("                    <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/productDetails\">Product</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cart\">Cart</a></li>\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkout\">Checkout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <!-- Button Group -->\r\n");
      out.write("            <div class=\"amado-btn-group mt-30 mb-100\">\r\n");
      out.write("                <a href=\"#\" class=\"btn amado-btn mb-15\">%Discount%</a>\r\n");
      out.write("                <a href=\"#\" class=\"btn amado-btn active\">New this week</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Cart Menu -->\r\n");
      out.write("            <div class=\"cart-fav-search mb-100\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cart\" class=\"cart-nav\"><img src=\"img/core-img/cart.png\" alt=\"\"> Cart <span>(0)</span></a>\r\n");
      out.write("                <a href=\"#\" class=\"fav-nav\"><img src=\"img/core-img/favorites.png\" alt=\"\"> Favourite</a>\r\n");
      out.write("                <a href=\"#\" class=\"search-nav\"><img src=\"img/core-img/search.png\" alt=\"\"> Search</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Social Button -->\r\n");
      out.write("            <div class=\"social-info d-flex justify-content-between\">\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Product Details Area Start -->\r\n");
      out.write("        <div class=\"single-product-area section-padding-100 clearfix\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                            <ol class=\"breadcrumb mt-50\">\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Furniture</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item\"><a href=\"#\">Chairs</a></li>\r\n");
      out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">white modern chair</li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 col-lg-7\">\r\n");
      out.write("                        <div class=\"single_product_thumb\">\r\n");
      out.write("                            <div id=\"product_details_slider\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                                <ol class=\"carousel-indicators\">\r\n");
      out.write("                                    <li class=\"active\" data-target=\"#product_details_slider\" data-slide-to=\"0\" style=\"background-image: url(img/product-img/pro-big-1.jpg);\">\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li data-target=\"#product_details_slider\" data-slide-to=\"1\" style=\"background-image: url(img/product-img/pro-big-2.jpg);\">\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li data-target=\"#product_details_slider\" data-slide-to=\"2\" style=\"background-image: url(img/product-img/pro-big-3.jpg);\">\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li data-target=\"#product_details_slider\" data-slide-to=\"3\" style=\"background-image: url(img/product-img/pro-big-4.jpg);\">\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ol>\r\n");
      out.write("                                <div class=\"carousel-inner\">\r\n");
      out.write("                                    <div class=\"carousel-item active\">\r\n");
      out.write("                                        <a class=\"gallery_img\" href=\"img/product-img/pro-big-1.jpg\">\r\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"img/product-img/pro-big-1.jpg\" alt=\"First slide\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"carousel-item\">\r\n");
      out.write("                                        <a class=\"gallery_img\" href=\"img/product-img/pro-big-2.jpg\">\r\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"img/product-img/pro-big-2.jpg\" alt=\"Second slide\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"carousel-item\">\r\n");
      out.write("                                        <a class=\"gallery_img\" href=\"img/product-img/pro-big-3.jpg\">\r\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"img/product-img/pro-big-3.jpg\" alt=\"Third slide\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"carousel-item\">\r\n");
      out.write("                                        <a class=\"gallery_img\" href=\"img/product-img/pro-big-4.jpg\">\r\n");
      out.write("                                            <img class=\"d-block w-100\" src=\"img/product-img/pro-big-4.jpg\" alt=\"Fourth slide\">\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 col-lg-5\">\r\n");
      out.write("                        <div class=\"single_product_desc\">\r\n");
      out.write("                            <!-- Product Meta Data -->\r\n");
      out.write("                            <div class=\"product-meta-data\">\r\n");
      out.write("                                <div class=\"line\"></div>\r\n");
      out.write("                                <p class=\"product-price\">$180</p>\r\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/productDetails\">\r\n");
      out.write("                                    <h6>White Modern Chair</h6>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <!-- Ratings & Review -->\r\n");
      out.write("                                <div class=\"ratings-review mb-15 d-flex align-items-center justify-content-between\">\r\n");
      out.write("                                    <div class=\"ratings\">\r\n");
      out.write("                                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                        <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"review\">\r\n");
      out.write("                                        <a href=\"#\">Write A Review</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Avaiable -->\r\n");
      out.write("                                <p class=\"avaibility\"><i class=\"fa fa-circle\"></i> In Stock</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"short_overview my-5\">\r\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid quae eveniet culpa officia quidem mollitia impedit iste asperiores nisi reprehenderit consequatur, autem, nostrum pariatur enim?</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Add to Cart Form -->\r\n");
      out.write("                            <form class=\"cart clearfix\" method=\"post\">\r\n");
      out.write("                                <div class=\"cart-btn d-flex mb-50\">\r\n");
      out.write("                                    <p>Qty</p>\r\n");
      out.write("                                    <div class=\"quantity\">\r\n");
      out.write("                                        <span class=\"qty-minus\" onclick=\"var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;\"><i class=\"fa fa-caret-down\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                        <input type=\"number\" class=\"qty-text\" id=\"qty\" step=\"1\" min=\"1\" max=\"300\" name=\"quantity\" value=\"1\">\r\n");
      out.write("                                        <span class=\"qty-plus\" onclick=\"var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;\"><i class=\"fa fa-caret-up\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button type=\"submit\" name=\"addtocart\" value=\"5\" class=\"btn amado-btn\">Add to cart</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Product Details Area End -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- ##### Main Content Wrapper End ##### -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### Newsletter Area Start ##### -->\r\n");
      out.write("    <section class=\"newsletter-area section-padding-100-0\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <!-- Newsletter Text -->\r\n");
      out.write("                <div class=\"col-12 col-lg-6 col-xl-7\">\r\n");
      out.write("                    <div class=\"newsletter-text mb-100\">\r\n");
      out.write("                        <h2>Subscribe for a <span>25% Discount</span></h2>\r\n");
      out.write("                        <p>Nulla ac convallis lorem, eget euismod nisl. Donec in libero sit amet mi vulputate consectetur. Donec auctor interdum purus, ac finibus massa bibendum nec.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Newsletter Form -->\r\n");
      out.write("                <div class=\"col-12 col-lg-6 col-xl-5\">\r\n");
      out.write("                    <div class=\"newsletter-form mb-100\">\r\n");
      out.write("                        <form action=\"#\" method=\"post\">\r\n");
      out.write("                            <input type=\"email\" name=\"email\" class=\"nl-email\" placeholder=\"Your E-mail\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- ##### Newsletter Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("    <footer class=\"footer_area clearfix\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                    <div class=\"single_widget_area\">\r\n");
      out.write("                        <!-- Logo -->\r\n");
      out.write("                        <div class=\"footer-logo mr-50\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\"><img src=\"img/core-img/logo2.png\" alt=\"\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Copywrite Text -->\r\n");
      out.write("                        <p class=\"copywrite\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\r\n");
      out.write("<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Single Widget Area -->\r\n");
      out.write("                <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                    <div class=\"single_widget_area\">\r\n");
      out.write("                        <!-- Footer Menu -->\r\n");
      out.write("                        <div class=\"footer_menu\">\r\n");
      out.write("                            <nav class=\"navbar navbar-expand-lg justify-content-end\">\r\n");
      out.write("                                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#footerNavContent\" aria-controls=\"footerNavContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("                                <div class=\"collapse navbar-collapse\" id=\"footerNavContent\">\r\n");
      out.write("                                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                                        <li class=\"nav-item active\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index\">Home</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/shop\">Shop</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/productDetails\">Product</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/cart\">Cart</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\"nav-item\">\r\n");
      out.write("                                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkout\">Checkout</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- ##### Footer Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\r\n");
      out.write("    <script src=\"script/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <!-- Popper js -->\r\n");
      out.write("    <script src=\"script/popper.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap js -->\r\n");
      out.write("    <script src=\"script/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Plugins js -->\r\n");
      out.write("    <script src=\"script/plugins.js\"></script>\r\n");
      out.write("    <!-- Active js -->\r\n");
      out.write("    <script src=\"script/active.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
