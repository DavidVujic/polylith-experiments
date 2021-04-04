## Software as building blocks 
There seems to be an ongoing trend in software development towards using monorepos. This trend is something I have seen especially in the Clojure community. 

### Polylith - a monorepo architecture
I like the way Polylith solves how to work with code using a components-first architecture. Similar to LEGO, components are building blocks. 
A component can be shared across apps, tools, libraries, serverless functions and services.

Read more here: https://polylith.gitbook.io/

### “The last architecture you will ever need”
I grabbed this from the Polylith docs: 

"... Polylith is a software architecture that applies functional thinking at the system scale. It helps us build simple, maintainable, testable, and scalable backend systems. ..."

Okay, backend systems. What about frontend systems? 🤔

### I want to Polylith all the things
Is it possible to use the Polylith architecture for a code base that includes web apps? This is something that I have wanted to find out. 

I’ve added backend Clojure code, frontend ClojureScript and also some glue in between in the form of `cljc` files. 
Cljc is Clojure code that can be consumed by both frontend and backend code. This makes it possible to share code across Clojure and ClojureScript, 
building things just like with LEGO bricks and baseplates.

### All the things?
I'll leave the question if ClojureScript and Clojure really should live in the same ecosystem unanswered and hope to get feedback from the community. 
__What are your thoughts about it?__

### Do we still have the Polylith one-REPL experience?
Well, we can have a two-REPLs experience. One for Clojure, that runs on top of the JVM, and one for ClojureScript that runs on top of JavaScript.

You can add and use new ClojureScript components while the REPL is running. Create the namespace and evaluate. But there is one thing that I have no solution for (yet).
When creating a new ClojureScript component and evaluating the entire namespace at once, I get a compilation error in the ClojureScript REPL: "file not on classpath".
The ClojureScript REPL have to be restarted to reload the source paths. But don't worry, you can still evaluate the individual functions in the namespace 
and they will be loaded as expected in the ClojureScript REPL.

### Tooling support?
Polylith has a very nice and useful tool to support creating building blocks and to verify the setup. 
You can create components, bases and projects - as long as it is Clojure. 
For ClojureScript, you will have to create components manually. But if you are lazy, like me, just create a Clojure component with the poly tool as you would for Clojure, 
and simply rename the file extension to `cljs` or `cljc` afterwards.

### Editor support?
Your editor most likely has support for running both Clojure and ClojureScript simultaneously. 
For Emacs, start the REPLs with the `cider-jack-in-clj&cljs` command and you're ready to go!



* The quote is from Joakim Tengstrands and Furkan Bayraktars talk about Polylith at the FuncProg Sweden 2020 meetup: https://youtu.be/pebwHmibla4
