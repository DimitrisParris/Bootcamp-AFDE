select film.title
from category
inner join film_category
on category.category_id=film_category.category_id
inner join film
on film_category.film_id=film.film_id
inner join language
on film.language_id=language.language_id
where category.name='Documentary' and language.name='English'