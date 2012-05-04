
[:div {:id "outer-wrapper"}
 [:div#cover]
 [:div#inner-wrapper
  [:div#one.section

   [:h1 "Introduction"]

   [:p "Clojure koans are exercised meant to initiate you to the mysteries of the "
    [:a {:href "http://www.clojure.org"} "Clojure language"]
    ". By following along the path set before you, you will touch on all"
    " the major aspects of the language, from simple datatypes to macros, from tail recursion to Java interoperability. Many will find Clojure quite different"
    " from any programming language they've used before. The koans' incremental, interactive approach to learning the language will help make the transition"
    " feel natural. By the time you are finished with them, Clojure will not be so mysterious at all."]]

  [:div#two.section
   [:h1 "Install Java"]

   [:p " Before we begin the koans, we need Clojure, and before we install Clojure, we'll need Java. You probably already have Java installed, but "
    "if you don't, it's not difficult. Oracle provides installation instructions for Windows users"
    [:a {:href "http://www.java.com/en/download/help/windows_manual_download.xml"} " here "]
    "and for Linux users "
    [:a {:href "http://www.java.com/en/download/help/linux_install.xml"} "here"]
    ". Apple distributes Java 6 with their system update tool."]
   [:br]
   [:p "After downloading Java (if necessary), go to your console and enter:"]
   [:div.terminal "~ $ java -version"]
   [:p "Make sure the version installed is 1.5 or greater."]]

  [:div#three.section
   [:h1 "Install the Koans"]

   [:p "If you'd like to jump into Clojure like the pros, you can install the koans with "
    [:a {:href "https://github.com/technomancy/leiningen"} "Leiningen"]
    ", Clojure's most popular dependency management tool. (It will install Clojure for us shortly.)"
    " Follow the "
    [:a {:href "https://github.com/technomancy/leiningen"} "installation instructions"]
    "for Leiningen bliss."]
   [:br]
   [:p "If you don't want to use Leiningen to manage dependencies for you, you can still easily install the koans manually."
    " Just download and unzip the latest version of the koans "
    [:a {:href "https://github.com/functional-koans/clojure-koans/downloads"} "here"]
    ", and you should be ready to start."]]

  [:div#five.section

   [:h1 "Run the First Koan"]

   [:p "Once you're inside the koans diretory, you can immediately begin by running"]
   [:div.terminal "clojure-koans $ script/run"]
   [:p "on Mac or Unix, or "]
   [:div.terminal "clojure-koans $ script\\run"]
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
   [:br]
   [:p "The koans, unlike tests in real test-driven projects, are already written for you. When you are"
    " ready to begin your own Clojure project and therefore your own tests, consider using a framework like"
    [:a {:href "http://http://speclj.com/"} " Speclj"]
    " to aid you on your journey."]]


  [:div#eight.section
   [:h1 "Contributors"]

   [:ul.contributors
    (doall (for [{name :name login :login} (get-contributors)]
             [:li
              [:a {:href (str "https://github.com/" login)} name]]))]

   [:p "If you have any questions or suggestions about the koans, feel free to contact "
    [:a {:href "mailto:colin@8thlight.com"} "Colin Jones"]
    ". Further contributions are always welcome."]]

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
    "."]]]

[:div#stripe
 [:img {:src "images/logo.png"}]
 [:ul
  [:li
   [:a {:href "#"} "Introduction"]]
  [:li
   [:a {:href "#"} "Install Java"]]
  [:li
   [:a {:href "#"} "Install the Koans"]]
  [:li
   [:a {:href "#"} "Run the First Koan"]]
  [:li
   [:a {:href "#"} "Repeat"]]
  [:li
   [:a {:href "#"} "A Word on Testing"]]
  [:li
   [:a {:href "#"} "Contributors"]]
  [:li
   [:a {:href "#"} "Thanks"]]]]]
