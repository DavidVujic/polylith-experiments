## Software as building blocks 
There seems to be an ongoing trend in software development towards using monorepos. 
This trend is something I have seen especially in the Clojure community. 

### Polylith - a monorepo architecture
I like the way Polylith solves how to work with code using a components-first architecture. 
Similar to LEGO, components are building blocks. A component can be shared across apps, serverless functions and services.

Read more here: https://polylith.gitbook.io/polylith/

### “The last architecture you will ever need”
I grabbed this from the Polylith docs: 

"... Polylith is a software architecture that applies functional thinking at the system scale. It helps us build simple, 
maintainable, testable, and scalable backend systems. ..."

Okay, backend systems. What about frontend systems?

### Polylith all the things
Is it possible to use the Polylith architecture for a code base that includes web apps? This is something that I 
have wanted to find out. 

I’ve added backend Clojure code, frontend ClojureScript and also some glue in between in the form of `cljc` files. 
Cljc is Clojure code that can be consumed by both frontend and backend code. 
This makes it possible to share code and build things just like with LEGO bricks and baseplates. 

### All the things?
I'll leave the question if ClojureScript and Clojure really should live in the same ecosystem unanswered and hope to get feedback from the community. 
__What are your thoughts?__

### Do we still have the Polylith one-REPL experience?
Well, we can have a two-REPLs experience. Clojure runs on top of the JVM, ClojureScript runs on top of JavaScript, 
and i think that require the source code to run in different REPLs. I have used shadow-cljs for ClojureScript, 
in combination with deps.edn to have development source paths in the same place.

### Issues
When I connect both REPLs, it seems that only one of them can be active. I’m not sure why. 
The inactive one becomes active as soon as I put focus the actual REPL client window. 
To me, this sounds like something that I have missed in configuring the editor and the REPL.

I think the following is only an issue with ClojureScript: I can add a new component, 
evaluate the namespace and functions individually and consume it from an existing component.

__Great!__ 

But there is one annoying thing: when evaluating the entire namespace (aka the buffer, aka the file) 
I get a compilation error in the ClojureScript REPL. The REPL need to be restarted - and I guess reload all source paths - 
to compile all namespaces correctly.
