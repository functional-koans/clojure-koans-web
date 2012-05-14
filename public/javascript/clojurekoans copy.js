$(document).ready(function() {
  var nav = $('#stripe li');
  nav.find('a').click(function() {
    var li = $(this).closest('li');
    var idx = $(nav).index(li);
    var section = $('.section').eq(idx);
  
    $('html, body').animate({scrollTop: section.offset().top});
    return false;
  });
});
