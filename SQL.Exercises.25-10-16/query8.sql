select  category.name, film.title
from    film 
inner join film_category 
on film.film_id=film_category.film_id
inner join category
on category.category_id=film_category.category_id