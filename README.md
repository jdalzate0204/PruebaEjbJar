# PruebaEjbJar

## Consulta
CREATE VIEW vista_autor_libro AS 
SELECT a.id, a.nombre, a.edad, a.identificacion,
COUNT(l.id_autor) AS cantidad_libros,
MAX(l.no_paginas) AS libro_mas_paginas,
(SELECT l.nombre FROM libro l WHERE l.no_paginas =
(SELECT MAX(l.no_paginas) from libro l)) AS nombre_libro_mas_paginas
FROM autor a, libro l 
GROUP BY a.id
