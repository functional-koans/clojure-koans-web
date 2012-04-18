
[:div {:id "outer-wrapper"}
 [:div#inner-wrapper
  [:div.section

   [:img#bull1 {:align "right" :src "images/bulls/bull1.gif"}]
   [:h1 "Introduction"]

   [:p "Clojure koans are exercises meant to initiate you to the mysteries of the Clojure. By following along the path set before you, you will touch on all"
    " the major aspects of the language, from simple datatypes to macros, from tail recursion to Java interoperability. Many will find Clojure quite different"
    " from any programming language they've used before. The koans' incremental, interactive approach to learning the language will help make the transition"
    " feel natural. By the time you are finished with them, Clojure will not be so mysterious at all."]]

  [:div.section
   [:img#bull2 {:align "right" :src "images/bulls/bull2.gif"}]
   [:h1 "Install Java"]

   [:p " Before we begin the koans, we need Clojure, and before we install Clojure, we'll need Java. You probably already have Java installed, but"
    "if you don't, it's not difficult. Oracle provides installation instructions for Windows users"
    [:a {:href "http://www.java.com/en/download/help/windows_manual_download.xml"} "here"]
    "and for Linux users"
    [:a {:href "http://www.java.com/en/download/help/linux_install.xml"} "here"]
    ". Apple distributes Java 6 with their system update tool."]
   [:br]
   [:p "After downloading Java (if necessary), go to your console and enter:"]
   [:div.terminal "~ $ java -version"]
   [:p "Make sure the version installed is 1.5 or greater."]]

  [:div.section
   [:img#bull3 {:align "right" :src "images/bulls/bull3.gif"}]
   [:h1 "Install Leiningen"]

   [:p "Now we're going to install Leiningen, Clojure's most popular dependency management tool. (It will install Clojure for us shortly.)"
    " If you have apt-get or homebrew, just run:"]
   [:div.terminal "~ $"
    [:em "your_package_manager_here"]
    " install leiningen"]
   [:p
    " and you're done! Otherwise, download the Leiningen script"
    [:a {:href "#"} "here"]
    "and  place it on your $PATH."]]

  [:div.section
   [:img#bull4 {:align "right" :src "images/bulls/bull4.gif"}]
   [:h1 "Download the Koans"]

   [:p "Clone the Clojure koans from "
    [:a {:href "#"} "Github"]
    "and enter it in a console. The following command will tell Leiningen to install Clojure and all other dependencies necessary to run the koans:"]
   [:div.terminal "clojure-koans $ lein deps"]]



  [:div.section
   [:img#bull5 {:align "right" :src "images/bulls/bull5.gif"}]
   [:h1 "Run the First Koan"]

   [:p "Once you're inside the koans diretory, you can immediately begin by running"]
   [:div.terminal "clojure-koans $ script/run"]
   [:p "on Mac or Unix, or "]
   [:div.terminal "clojure-koans $ script/run"]
   [:p "on Windows. You'll probably see an error message like this:"]
   [:div.terminal " Problem in ~/clojure-koans/src/koans/equalities.clj"
    [:br]
    "---------------------"
    [:br]
    "Assertion failed!"
    [:br]
    "We shall contemplate truth by testing reality, via equality."
    [:br]
    "(= __ true)"]
   [:p "The output is telling you that you have a failing test in equalities.clj. So open that file up in a text editor and try to make it pass!"]]

  [:div.section
   [:img#bull6 {:align "right" :src "images/bulls/bull6.gif"}]
   [:h1 "Repeat"]

   [:p " After you run and pass your first test, you'll find that the next one is failing. After all the tests in a file are passing, the"
    "run script will automatically begin testing the next file in the koans sequence."]]

  [:div.section
   [:img#bull7 {:align "right" :src "images/bulls/bull7.gif"}]
   [:h1 "A Word on Testing"]

   [:p "The pattern of writing failing tests first and code to make them pass later is no mere novelty: it is"
    " the essence of test-driven development (TDD). The sages of TDD say that every new test should strive to"
    " be the simplest and most natural extension of those that come before it, so as to cover only one new part"
    " of the code. They also enjoin disciples to meditate on their progress regularly: after a test is made"
    " to pass, one should pause to refactor and refine one's code before moving on to the next test."]
   [:br]
   [:p "The koans, unlike tests in real test-driven projects, are already written for you. When you are"
    " ready to begin your own Clojure project and therefore your own tests, consider using a framework like"
    " Speclj to aid you on your journey."]]


  [:div.section
   [:h1 "Contributors"]

   [:ul
    [:li "Aaron Bedra"]
    [:li "Colin Jones (maintainer)"]
    [:li "Eric Lavigne"]
    [:li "Nuno Marquez"]
    [:li "Micah Martin"]
    [:li "MIchael Kohl"]
    [:li "Ben Lickly"]]
   [:ul
    [:li "Alex Robbins"]
    [:li "Jaskirat Singh Veen"]
    [:li "Mark Simpson"]
    [:li "Mike Jansen"]
    [:li "Caleb Phillips"]
    [:li "Doug South"]]]

  [:div.section
]
  ]]
