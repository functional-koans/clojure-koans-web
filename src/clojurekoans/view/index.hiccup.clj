[:div#outer-wrapper
 [:div#stripe
  [:img {:src "images/logo.png"}]
  [:ul
   [:li
    [:a {:href "#"} "Introduction"]]
   [:li
    [:a {:href "#"} "1. Install Java"]]
   [:li
    [:a {:href "#"} "2. Install the Koans"]]
   [:li
    [:a {:href "#"} "3. Run the First Koan"]]
   [:li
    [:a {:href "#"} "4. Repeat"]]
   [:li
    [:a {:href "#"} "A Word on Testing"]]
   [:li
    [:a {:href "#"} "Contributors"]]
   [:li
    [:a {:href "#"} "Thanks"]]]]

 [:div#inner-wrapper
  [:div#one.section

   [:h1 "Introduction"]

   [:p "Clojure koans are exercises meant to initiate you to the mysteries of the "
    [:a {:href "http://www.clojure.org"} "Clojure language"]
    ". By following along the path set before you, you will touch on all"
    " the major aspects of the language, from simple datatypes to macros, from tail recursion to Java interoperability. Many will find Clojure quite different"
    " from any programming language they've used before. The koans' incremental, interactive approach to learning the language will help make the transition"
    " feel natural. By the time you are finished with them, Clojure will not be so mysterious at all."]]

  [:div#two.section
   [:h1 "Install Java"]

   [:p " Before we begin the koans, we need Clojure, and before we install Clojure, we'll need Java. You probably already have Java installed, but "
    "if you don't, it's not difficult. Oracle provides "
    [:a {:href "http://www.java.com/en/download/help/windows_manual_download.xml"} "installation instructions for Windows users"]
    ", and Linux users should use their package manager of choice. Apple distributes Java 6 with their system update tool."]
   [:p "After downloading Java (if necessary), go to your console and enter:"]
   [:div.terminal "~ $ java -version"]
   [:p "Make sure the version installed is 1.5 or greater."]]

  [:div#three.section
   [:h1 "Install the Koans"]

   [:p "If you'd like to jump into Clojure like the pros, you can install the koans with "
    [:a {:href "http://leiningen.org"} "Leiningen"]
    ", Clojure's most popular dependency management tool. (It will install Clojure for us shortly.)"
    " Follow the "
    [:a {:href "http://leiningen.org/#install"} "installation instructions"]
    " for Leiningen bliss. "]

   [:p "Important: if you already have lein 1.x installed, you'll need to "
    [:a {:href "https://github.com/technomancy/leiningen/wiki/Upgrading"} "upgrade to Leiningen 2"]
    "."]
   [:p "Once you have Leiningen installed, you just need to clone the koans repo:"]
   [:div.terminal "$ git clone git://github.com/functional-koans/clojure-koans.git"]
   [:p "If you don't want to use Leiningen to manage dependencies for you, you
       can still easily install the koans manually. [Note: this option will only
       work until "
    [:a {:href "https://github.com/blog/1302-goodbye-uploads"} "Github shuts down the Downloads feature completely"]
    " in March 2013.] Just download and unzip the latest version of the koans "
    [:a {:href "https://github.com/functional-koans/clojure-koans/downloads"} "here"]
    ", and you should be ready to start."]]

  [:div#five.section

   [:h1 "Run the First Koan"]

   [:p "Once you're inside the koans directory, you can immediately begin by running"]
   [:div.terminal "$ lein koan run"]
   [:p "if you have Leiningen installed as described above."]
   [:p "(Don't forget to cd into the clojure-koans directory after you've cloned the repo!)"]
   [:p "Or, if you're not using Leiningen, you can use"]
   [:div.terminal "$ script/run"]
   [:p "on Mac or Unix, or "]
   [:div.terminal "$ script\\run"]
   [:p "on Windows. "]
   [:p " instead. You'll probably see an error message like this:"]
   [:div.terminal " Now meditate on ~/clojure-koans/src/koans/01_equalities.clj:3"
    [:br]
    "---------------------"
    [:br]
    "Assertion failed!"
    [:br]
    "We shall contemplate truth by testing reality, via equality."
    [:br]
    "(= __ true)"]
   [:p "The output is telling you that you have a failing test in the file
       01_equalities.clj, on line 3. So open that file up in a text editor and
       make it pass by filling in the blanks!"]]

  [:div#six.section
   [:h1 "Repeat"]

   [:p " After you run and pass your first test, you'll find that the next one is failing. After all the tests in a file are passing, the"
    " run script will automatically begin testing the next file in the koans sequence."]]

  [:div#seven.section
   [:h1 "A Word on Testing"]

   [:p "The pattern of writing failing tests first and code to make them pass later is no mere novelty: it is"
    " the essence of test-driven development (TDD). The sages of TDD say that every new test should strive to"
    " be the simplest and most natural extension of those that come before it, so as to cover only one new part"
    " of the code. They also enjoin disciples to meditate on their progress regularly: after a test is made"
    " to pass, one should pause to refactor and refine one's code before moving on to the next test."]
   [:p "The koans, unlike tests in real test-driven projects, are already written for you. When you are"
    " ready to begin your own Clojure project and therefore your own tests, consider using a framework like"
    [:a {:href "http://speclj.com/"} " Speclj"]
    " to aid you on your journey."]]


  [:div#eight.section
   [:h1 "Contributors"]

   [:p [:a {:href "https://github.com/functional-koans/clojure-koans/graphs/contributors"} "Our Contributors"]]

   [:p "If you have any questions or suggestions about the koans, feel free to "
    [:a {:href "https://github.com/functional-koans/clojure-koans/"} "open an issue or pull request"]
    "."]]

  [:div#nine.section
   [:h1 "Thanks"]

   [:p "Using the koans metaphor as a tool for learning a programming language started with the "
    [:a {:href "http://rubykoans.com/"} "Ruby Koans"]
    " by "
    [:a {:href "http://edgecase.com/"} "EdgeCase"]
    "; the Clojure koans themselves were started by developers at "
    [:a {:href "http://thinkrelevance.com/"} "Relevance"]
    ". This website is produced and hosted by "
    [:a {:href "http://www.8thlight.com"} "8th Light"]
    " and powered by "
    [:a {:href "http://www.joodoweb.com"} "Joodo"]
    "."]]]
[:div.clearfix]]
