Select a.category_id, count(a.film_id) as NumberOfFilms
from film_category a
group by a.category_id
order by NumberOfFilms