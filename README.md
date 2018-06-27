
<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>


# Nano Vaadin V10 - Ramp up in a second.
A nano project to start a Vaadin project. Perfect for Micro-UIs packed as fat jar in a docker image.

## target of this project
The target of this project is a minimal ramp-up time for a first hello world.
Why we need one more HelloWorld? Well, the answer is quite easy. 
If you have to try something out, or you want to make a small POC to present something,
there is no time and budget to create a demo project?

You don´t want to copy paste all small things together.
Here you will get a Nano-Project that will give you all in a second.

Clone the repo and start editing the class ```HelloWorld```.
Nothing more. 

## How does it work?
The project is based on meecrowave from Apache. 
[http://openwebbeans.apache.org/meecrowave/index.html](http://openwebbeans.apache.org/meecrowave/index.html)

You can see the basic init for the Servlet-Container in the main method.

```java
      new Meecrowave(new Meecrowave.Builder() {
        {
          randomHttpPort();
          setTomcatScanning(true);
          setTomcatAutoSetup(false);
          setHttp2(true);
        }
      })
          .bake()
          .await();
```

Happy Coding.

if you have any questions: ping me on Twitter [https://twitter.com/SvenRuppert](https://twitter.com/SvenRuppert)
or via mail.
