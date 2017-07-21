$(document).ready(function() {
  var nav = $('#stripe li');
  nav.find('a').click(function() {
    var li = $(this).closest('li');
    var idx = $(nav).index(li);
    var section = $('.section').eq(idx);

    if(window.innerWidth <= 800) {
      $("#nav").slideToggle();
    }

    $('html, body').animate({scrollTop: section.offset().top});
    return false;
  });

  $("#nav").addClass("js").before('<div id="menu">☰</div>');
  $("#menu").click(function(){
	   $("#nav").slideToggle();
  });

});
