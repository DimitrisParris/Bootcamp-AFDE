select category.name, count(film_category.film_id) as NumberOfFilms
from film_category
inner join category
on film_category.category_id=category.category_id
group by film_category.category_id
having NumberOfFilms>59
order by NumberOfFilms