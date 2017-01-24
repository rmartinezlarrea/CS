# Java

## Servlets

## Http request:
- enter a URL, click a link, submit a form or any event in the broswer: example: <www.amazon.com>
- crete the HTTP request: Developer tool -> Network, click on <www.amazon.com>, see Headers, Request header.
- IP number of the address (ping in CommandPrompt  ping www.casio.jp)
- connection to the server (tracert in CommandPrompt:   tracert www.casio.jp)
- process in the server: web -> application -> thread -> process & DDBB -> application -> web
- browser get the response: Developer tool -> Network, see Headers -> Response header and Response
- build the DOM tree: Developer tool -> Elements
- browser request other resources (images, js, css): Developer tool -> Network (second and next requests)
- styles are applied (remove head node in Developer tool -> Elements)
- JavaScript is applied
- the page is rendered

## Session in Servlets
- Hidden fields. Example in ShoppingCart.java
- URL Rewriting
- [Cookies](http://www.20thingsilearned.com/en-US/browser-cookies/1)

## Cookies
- See the cookies with [Browser settings](chrome://settings/) and Settings ->Show advanced settings... ->Content settings... -> All cookies and site data
- Cookies in the network: Console (F12), Network, reload (F5) and click url - > headers -> view source
- Example with Amazon
- Java Classes:
  - [HttpServletRequest getSession(boolean create)](http://docs.oracle.com/javaee/5/api/javax/servlet/http/HttpServletRequest.html#getSession(boolean))
  - [HttpSession](http://docs.oracle.com/javaee/5/api/index.html?javax/servlet/http/HttpSession.html)
    - [getAttribute(String name)](http://docs.oracle.com/javaee/5/api/javax/servlet/http/HttpSession.html#getAttribute(java.lang.String))
    - [setAttribute(String name, Object value)](http://docs.oracle.com/javaee/5/api/javax/servlet/http/HttpSession.html#setAttribute(java.lang.String, java.lang.Object))
    
---
[Edit](https://github.com/nicolasserrano/CS/edit/master/Servlets.md)
